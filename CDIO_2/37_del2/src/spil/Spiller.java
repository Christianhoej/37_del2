package Terningespil;

public class Spiller {

	public Spiller() {
	}
	private String navn;
	private String spiller;
	private int penge;
	private boolean vinder;

	//Metode for setNavn
	public void setNavn(String navn) {
		spiller = navn;
	}

	//Metode for getNavn
	public String getNavn() {
		return spiller;
	}	
	
	
	
	//Metode for setVinder
	public void setVinder(boolean vinder) {
		this.vinder=vinder;
	}
	//Metode for getVinder
	public boolean getVinder() {
		boolean resultat=vinder;
		return vinder;
	}	
}
