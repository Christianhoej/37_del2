package spil;

public class Konto {
	//private int startBeholdning;
	private int beholdning;
	private int minBeholdning;
	private int vinderBeholdning;

	public Konto(int startBeholdning, int minBeholdning, int vinderBeholdning){//constructor
		beholdning = startBeholdning;
		this.minBeholdning = minBeholdning;
		this.vinderBeholdning = vinderBeholdning;

	}

	public boolean opdaterBeholdning(int beholdning){//opdaterer beholdning alt efter parameteren den modtager og sikrer at minimumsbeholdning ikke overskrides
		this.beholdning +=beholdning;
		if(this.beholdning<minBeholdning){
			this.beholdning=minBeholdning;
			return true;
		}
		else
			return false;	
	}

	public int getBeholdning(){//Henter beholdning
		return beholdning;
	}

	public int getVinderBeholdning() {//returnerer grænseværdie for hvornår der er vundet.
		return vinderBeholdning;
	}
}
