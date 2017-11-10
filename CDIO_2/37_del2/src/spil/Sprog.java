package spil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sprog {

	private String winner, throwDice, playerName, player, negativeSaldo; 
	private String[] tower, crater, palaceGates, coldDesert, walledCity, monastery;
	private String[] blackCave, mountainHuts, werewall, pit, goldmine, rules;

	public void tekst(String fil) throws IOException {
		BufferedReader br;
		br = new BufferedReader(new FileReader(fil));
		String currentLine = br.readLine();
		while (currentLine != null) {
			switch (currentLine){
			case "winner":
				currentLine = br.readLine();
				winner= currentLine;
				break;
			case "throw":
				currentLine = br.readLine();
				throwDice = currentLine;
				break;
			case "playerName":
				currentLine = br.readLine();
				playerName = currentLine;
				break;
			case "player":
				currentLine = br.readLine();
				player = currentLine;
				break;
			case "tower":
				currentLine = br.readLine();
				tower = currentLine.split("#");
				break;
			case "crater":
				currentLine = br.readLine();
				crater = currentLine.split("#");
				break;
			case "palaceGates":
				currentLine = br.readLine();
				palaceGates = currentLine.split("#");
				break;
			case "coldDesert":
				currentLine = br.readLine();
				coldDesert = currentLine.split("#");
				break;
			case "walledCity":
				currentLine = br.readLine();
				walledCity = currentLine.split("#");
				break;
			case "monastery":
				currentLine = br.readLine();
				monastery = currentLine.split("#");
				break;
			case "mountainHuts":
				currentLine = br.readLine();
				mountainHuts = currentLine.split("#");
				break;
			case "blackCave":
				currentLine = br.readLine();
				blackCave = currentLine.split("#");
				break;
			case "werewall":
				currentLine = br.readLine();
				werewall = currentLine.split("#");
				break;
			case "pit":
				currentLine = br.readLine();
				pit = currentLine.split("#");
				break;
			case "goldmine":
				currentLine = br.readLine();
				goldmine = currentLine.split("#");
				break;
			case "negativeSaldo":
				currentLine = br.readLine();
				negativeSaldo =currentLine;
				break;
			case "rules":
				currentLine = br.readLine();
				rules = currentLine.split("#");
				break;
			}
			currentLine = br.readLine();


		}
		br.close();
	}

	public String getWinner() {
		return winner;
	}
	public String getThrowDice() {
		return throwDice;
	}
	public String getPlayerName() {
		return playerName;
	}
	public String getPlayer() {
		return player;
	}
	public String[] getTower() {
		return tower;
	}
	public String[] getCrater() {
		return crater;
	}
	public String[] getPalaceGates() {
		return palaceGates;
	}
	public String[] getColdDesert() {
		return coldDesert;
	}
	public String[] getWalledCity(){
		return walledCity;
	}
	public String[] getMonastery() {
		return monastery;
	}
	public String[] getBlackCave() {
		return blackCave;
	}
	public String[] getMountainHuts() {
		return mountainHuts;
	}
	public String[] getWerewall() {
		return werewall;
	}
	public String[] getPit() {
		return pit;
	}
	public String[] getGoldmine() {
		return goldmine;
	}
	public String getNegativeSaldo(){
		return negativeSaldo;
	}
	public String[] getRules() {
		return rules;
	}
}
