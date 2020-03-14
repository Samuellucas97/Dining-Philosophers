package jantar.dinner;

import java.util.concurrent.Semaphore;

public class Garfo {
	
	private Semaphore avaliable;
	
	public Garfo () { 
		this.avaliable = new Semaphore(1, true);
	}
	
	public void devolverGarfo() {
		if (this.avaliable.availablePermits() <= 1)
			this.avaliable.release();
	}
	
	public void pegarGarfo() throws InterruptedException {
		this.avaliable.acquire();
	}
	
	public Boolean garfoDisponivel() {
		if ( this.avaliable.availablePermits() == 1 )
			return true;
		else
			return false;
	}
}