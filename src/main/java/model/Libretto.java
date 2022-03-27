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
	/**
	 * Restituisce il punteggio ottenuto all'esame di cui
	 * specifico il nome
	 */
	public Integer puntiEsame(String nome) {
		for(Voto v : this.voti) {
			if(v.getNomeCorso().compareTo(nome)==0) {
				return v.getPunti();
				}
			}
		//return -1;
		return null;
		//throw new IllegalArgumentException("Corso non trovato");
		
	}
	
	public boolean isDuplicato(Voto v) {
		for(Voto v1: this.voti) {
			if(v1.equals(v))
				return true;
		}
		return false;
		
	}
	
	public boolean isConflitto(Voto v) {
		Integer punti = this.puntiEsame(v.getNomeCorso());
		if(punti != null && punti != v.getPunti())
			return true;
		else
			return false;
	}
	public String toString() {
		return this.voti.toString();
		
	}
	
	
}
