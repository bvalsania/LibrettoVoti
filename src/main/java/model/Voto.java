package model;

public class Voto {
	
	private String nomeCorso;
	private int punti;

	public Voto(String nomeCorso, int punti) {
		super();
		this.nomeCorso = nomeCorso;
		this.punti = punti;
	}
	public String getNomeCorso() {
		return nomeCorso;
	}
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	@Override
	public String toString() {
		return  nomeCorso +": "+ punti;
	}

	
}
