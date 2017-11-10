package spil;

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

		
		
			GUI.getUserButtonPressed("", "Tryk for at kaste");


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
			pointSum += 250;
			GUI.displayChanceCard();


			
			break;
		case 3:
			pointSum += -100;
			GUI.displayChanceCard();


			break;
		case 4:
			pointSum += 100;
			GUI.displayChanceCard();


			break;
		case 5:
			pointSum += -20;
			GUI.displayChanceCard();


			break;
		case 6:
			pointSum +=180;
			GUI.displayChanceCard();


			break;
		case 7:
			pointSum +=0 ;
			GUI.displayChanceCard();


			break;
		case 8:
			pointSum += -70;
			GUI.displayChanceCard();
			GUI.setBalance(spillerensNavn, pointSum);

			break;
		case 9:
			pointSum += 60;
			GUI.displayChanceCard();

			break;
		case 10:
			pointSum += -80; // Her bør pointene evt. trækkes med det samme.
			GUI.displayChanceCard();



			break;
		case 11:
			pointSum += -50;
			GUI.displayChanceCard();


			break;
		case 12:
			pointSum += 650;
			GUI.displayChanceCard();


			break;
		

		}

		return pointSum;

		
	}

}