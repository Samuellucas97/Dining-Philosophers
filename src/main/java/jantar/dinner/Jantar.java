package jantar.dinner;

import java.util.ArrayList;

public class Jantar {
	
	private static Mesa mesa;	
	private static ArrayList<Filosofo> filosofos;
	
	public Jantar() {
		Jantar.mesa = new Mesa(5);
		Jantar.filosofos = new ArrayList<Filosofo>();
		
		for (Integer i=0; i<5;++i)
			Jantar.filosofos.add( new Filosofo(i, Jantar.mesa) );
	} 
	
	public static void main(String[] args) {
		new Jantar();
		
		for (Integer i=0; i<filosofos.size();++i)
			new Thread( Jantar.filosofos.get(i) ).start();
	}	
}