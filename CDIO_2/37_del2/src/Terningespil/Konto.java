package Terningespil;

public class Konto {

	private int balance;

	public Konto() {
		balance=1000;
	}

	//Metode for getBalance
	public int getBalance() {
		return balance;
	}

	//Metode til når spilleren får penge
	public int indsætPenge(int beløb) {
		while (balance>=0) {
			if (beløb>=0) {
				balance += beløb;
				return balance;
			}
			else 
				balance -= beløb;
			return balance;
		}
		return balance;
	}

}
