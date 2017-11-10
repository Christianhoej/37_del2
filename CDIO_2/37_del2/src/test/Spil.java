package test;

import java.io.IOException;  

import desktop_resources.GUI;
import spil.Bræt;
import spil.Spiller;
import spil.Sprog;
import spil.Tur;

public class Spil {

	public static void main(String[] args) {
		skrivfil fil = new skrivfil();
		try {
			fil.skrivFil();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Bræt bræt = new Bræt();
		bræt.lavBræt();
		Sprog sp = new Sprog();
		try {
			sp.tekst("Dansk.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Spiller[] spillerArray = new Spiller[2];

		for(int i=0; i<spillerArray.length; i++){
			int startbeløb = 1000;
			String s = GUI.getUserString(sp.getPlayerName() +" "+ (i+1));
			if(s.equals(""))
				s = sp.getPlayer() +" " + (i+1);
			spillerArray[i] = new Spiller(s,startbeløb);
			GUI.addPlayer(s, startbeløb);
		}
		
		boolean fundetVinder = false;
		while (fundetVinder == false) {
			for(int j = 0; spillerArray.length>j; j++) {
				spillerArray[j].brugTur(new Tur(spillerArray[j].getNavn()));

				fundetVinder = spillerArray[j].isVinder();
				if (fundetVinder == true)
					break;
			}
		}
	}
}
