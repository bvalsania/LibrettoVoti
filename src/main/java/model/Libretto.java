package model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	public void add(Voto voto) {
		this.voti.add(voto);
	}
	
	public Libretto filtraPunti(int punti) {
		Libretto result = new Libretto();
		for(Voto v: this.voti)
			if(v.getPunti() == punti)
				result.add(v);
		return result;
	}

	public String toString() {
		return this.voti.toString();
		
	}
	
	
}
