package spil;


import java.awt.Color;   

import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_fields.Start;
import desktop_resources.GUI;

// Denne klasse opretter brættet med de 12 forskellige felter, hvor felt 1 er et startfelt, da vi ikke kan få 1. 
public class Bræt{
	Sprog sp = new Sprog();
	public void lavBræt() {
		try {
			sp.tekst("dansk.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Field[] fields = new Field[12];
		fields[0] = new Start.Builder().setTitle("Start").setSubText("").setDescription("").setBgColor(Color.RED).build();

		fields[1] = new Shipping.Builder()
				.setPicture("tower.jpg")
				.setTitle(sp.getTower()[0])
				.setSubText("+250")
				.setDescription(sp.getTower()[1])
				.setRent("+250")
				.build();
		fields[2] = new Shipping.Builder()
				.setPicture("crater.jpg")
				.setTitle(sp.getCrater()[0])
				.setSubText("-100")
				.setDescription(sp.getCrater()[1])
				.setRent("-100")
				.build();
		fields[3] = new Shipping.Builder()
				.setPicture("palaceGates.jpg")
				.setTitle(sp.getPalaceGates()[0])
				.setSubText("+100")
				.setDescription(sp.getPalaceGates()[1])
				.setRent("+100")
				.build();
		fields[4] = new Shipping.Builder()
				.setPicture("coldDesert.jpg")
				.setTitle(sp.getColdDesert()[0])
				.setSubText("-20")
				.setDescription(sp.getColdDesert()[1])
				.setRent("-20")
				.build();
		fields[5] = new Shipping.Builder()
				.setPicture("walledCity.jpg")
				.setTitle(sp.getWalledCity()[0])
				.setSubText("+180")
				.setDescription(sp.getWalledCity()[1])
				.setRent("+180")
				.build();
		fields[6] = new Shipping.Builder()
				.setPicture("monastery.jpg")
				.setTitle(sp.getMonastery()[0])
				.setSubText("0")
				.setDescription(sp.getMonastery()[1])
				.setRent("0")
				.build();
		fields[7] = new Shipping.Builder()
				.setPicture("blackCave.jpg")
				.setTitle(sp.getBlackCave()[0])
				.setSubText("-70")
				.setDescription(sp.getBlackCave()[1])
				.setRent("-70")
				.build();
		fields[8] = new Shipping.Builder()
				.setPicture("hutMountain.jpg")
				.setTitle(sp.getMountainHuts()[0])
				.setSubText("+60")
				.setDescription(sp.getMountainHuts()[1])
				.setRent("+60")
				.build();		
		fields[9] = new Shipping.Builder()
				.setPicture("werewolf.jpg")
				.setTitle(sp.getWerewall()[0])
				.setSubText("-80")
				.setDescription(sp.getWerewall()[1])
				.setRent("-80")
				.build();		
		fields[10] = new Shipping.Builder()
				.setPicture("pit.jpg")
				.setTitle(sp.getPit()[0])
				.setSubText("-50")
				.setDescription(sp.getPit()[1])
				.setRent("-50")
				.build();	
		fields[11] = new Shipping.Builder()
				.setPicture("goldmine.jpg")
				.setTitle(sp.getGoldmine()[0])
				.setSubText("+650")
				.setDescription(sp.getGoldmine()[1])
				.setRent("+650")
				.build();			
		GUI.create(fields);
		String rules = "";
		for(int i=0; i<sp.getRules().length;i++){
			rules +=sp.getRules()[i] +"\n";
		}
		GUI.showMessage(rules);	
	}  
}

