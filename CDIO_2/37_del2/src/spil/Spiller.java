package spil;

import java.io.IOException; 

import desktop_resources.GUI;

public class Spiller {
	private String navn;
	private boolean vinder;
	private Konto konto; 

	public Spiller(String navn, int startBeholdning) {
		this.navn = navn;
		konto = new Konto(startBeholdning, 0, 3000);
	}



	public String getNavn() {
		return navn;
	}

	public int getPoint() {
		return konto.getBeholdning();

	}

	public boolean isVinder() {
		return vinder;
	}

	public void brugTur(Tur tur) {
		Sprog sp = new Sprog();
		try {
			sp.tekst("dansk.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int omgangspoint = 0;
		do {
			omgangspoint = tur.brugOmgang();
			boolean negativBeholdning = konto.opdaterBeholdning(omgangspoint);
			if(negativBeholdning == true)
				GUI.displayChanceCard(sp.getNegativeSaldo());
			int beholdning = konto.getBeholdning();
			GUI.setBalance(navn, beholdning);
			if(konto.getBeholdning() >= konto.getVinderBeholdning()) {
				this.vinder=true;
				GUI.displayChanceCard(navn + " " + sp.getWinner());
			}

		}while(omgangspoint == -80);
	}
}
