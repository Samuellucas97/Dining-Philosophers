package jantar.dinner;

import java.util.ArrayList;

public class Mesa {
	
	private ArrayList<Garfo> listaGarfos;

	public Mesa (Integer n) {
		this.listaGarfos = new ArrayList<Garfo>();
		
		for (Integer i = 0; i< n; ++i)	
			listaGarfos.add(new Garfo());
	}
	
	public Garfo getGarfo(Integer i) { 
		return listaGarfos.get(i);
	}
	
	public Integer tamanhoDaMesa() { 
		return listaGarfos.size();
	}
}