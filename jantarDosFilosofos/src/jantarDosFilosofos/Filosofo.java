package jantarDosFilosofos;

public class Filosofo implements Runnable {
	
	private Integer id;
	private Mesa mesa;
	private Integer tempoDeFome;
	
	public Filosofo (Integer id, Mesa mesa) {
		this.id = id;
		this.mesa = mesa;
		this.tempoDeFome = 0;
	}

	private void pensar() {
		try {
			Integer tempoPensando = (int)(Math.random() * (4 - 1 + 1) + 1);
			tempoDeFome += tempoPensando;
			System.out.println("FILOSOFO:" + this.id + ":" + " PENSANDO... (" + tempoPensando +" segundos)");
			Thread.sleep( tempoPensando );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void comer (Integer id_anterior) {
		try {	
			Integer tempoPensando = (int)(Math.random() * (12 - 1 + 1) + 1);
			mesa.getGarfo(id_anterior).pegarGarfo();
		 	mesa.getGarfo(id).pegarGarfo(); 
		 	tempoDeFome = 0;
			System.out.println("FILOSOFO:" + this.id + ":" + " COMENDO... (" + tempoPensando +" segundos)");
			Thread.sleep(tempoPensando);
			mesa.getGarfo(id_anterior).devolverGarfo();
			mesa.getGarfo(id).devolverGarfo(); 
				
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		int id_anterior = id-1;

		if (id == 0)
			id_anterior = mesa.tamanhoDaMesa()-1;
		
		while (true) {
			if (tempoDeFome > 30) {
				System.out.println("FILOSOFO:" + this.id + ":" + " MORREU DE FOME... :(");
				break;
			}
				
			if ( mesa.getGarfo(id_anterior).garfoDisponivel() && mesa.getGarfo(id).garfoDisponivel() )
				comer(id_anterior);
			else
				pensar();
		}
	}
}