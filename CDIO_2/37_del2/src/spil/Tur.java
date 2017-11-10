package spil;

import java.io.IOException;
import desktop_resources.GUI;

public class Tur {
	Kast kast = new Kast();
	String spillerensNavn;
	int pointSum;

	public Tur(String spillerensNavn){
		this.spillerensNavn = spillerensNavn;
	}


	public int brugOmgang() {
		int terningeSum = 0;
		Sprog sp = new Sprog();
		try {
			sp.tekst("dansk.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		GUI.getUserButtonPressed("", sp.getThrowDice() +" "+ spillerensNavn);


		kast.kastTerninger();
		terningeSum = kast.getSum();

		GUI.setDice(kast.getTerning1Værdi(), kast.getTerning2Værdi());

		for(int i=1; i<=terningeSum; i++){
			GUI.removeAllCars(spillerensNavn);
			GUI.setCar(i, spillerensNavn);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		switch(terningeSum) {
		case 2:
			pointSum = 250;
			GUI.displayChanceCard(sp.getTower()[1]);
			break; 
		case 3:
			pointSum = -100;
			GUI.displayChanceCard(sp.getCrater()[1]);
			break;
		case 4:
			pointSum = 100;
			GUI.displayChanceCard(sp.getPalaceGates()[1]);
			break;
		case 5:
			pointSum = -20;
			GUI.displayChanceCard(sp.getColdDesert()[1]);
			break;
		case 6:
			pointSum =180;
			GUI.displayChanceCard(sp.getWalledCity()[1]);
			break;
		case 7:
			pointSum =0 ;
			GUI.displayChanceCard(sp.getMonastery()[1]);
			break;
		case 8:
			pointSum = -70;
			GUI.displayChanceCard(sp.getBlackCave()[1]);
			break;
		case 9:
			pointSum = 60;
			GUI.displayChanceCard(sp.getMountainHuts()[1]);
			break;
		case 10:
			pointSum = -80;
			GUI.displayChanceCard(sp.getWerewall()[1]);
			break;
		case 11:
			pointSum = -50;
			GUI.displayChanceCard(sp.getPit()[1]);
			break;
		case 12:
			pointSum = 650;
			GUI.displayChanceCard(sp.getGoldmine()[1]);
			break;
		}

		return pointSum;


	}

}