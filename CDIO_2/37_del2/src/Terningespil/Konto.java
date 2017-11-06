package Terningespil;

public class Account {

	private int balance;

	public Account() {
		balance=1000;
	}

	//Metode for getBalance
	public int getBalance() {
		return balance;
	}

	//Metode til når spilleren får penge
	public int deposit(int amount) {
		while (balance>=0) {
			if (amount>=0) {
				balance += amount;
				return balance;
			}
			else 
				balance -= amount;
			return balance;
		}
		return balance;
	}

}
