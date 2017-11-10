package test;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class skrivfil {
	
	public void skrivFil() throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("Dansk.txt"));

		bw.write("winner");
		bw.newLine();
		bw.write("har vundet!");
		bw.newLine();
		bw.write("throw");
		bw.newLine();
		bw.write("Tryk for at kaste terningerne");
		bw.newLine();
		bw.write("playerName");
		bw.newLine();
		bw.write("Indtast navn på spiller");
		bw.newLine();
		bw.write("player");
		bw.newLine();
		bw.write("spiller");
		bw.newLine();
		bw.write("tower");
		bw.newLine();
		bw.write("Tårn#Du har besejret en ond troldmand i tårnet finder hans skat på 250");
		bw.newLine();
		bw.write("crater");
		bw.newLine();
		bw.write("Crater#Du er faldet ned i krateret på en vulkan og må betale 100 for at blive reddet op");
		bw.newLine();
		bw.write("palaceGates");
		bw.newLine();
		bw.write("Palads Port#Du har bygget nogle flotte palads port og kejseren belønner dig med 100");
		bw.newLine();
		bw.write("coldDesert");
		bw.newLine();
		bw.write("Kold ørken#Grundet et opgør med den lokale høvding er du nødt til at flygte gennem kolde ørken og må betale 20 for rationer til turen.");
		bw.newLine();
		bw.write("walledCity");
		bw.newLine();
		bw.write("Bemuret by#Som leder af den bemurede by får du 180 i skatteindtægter.");
		bw.newLine();
		bw.write("monastery");
		bw.newLine();
		bw.write("Kloster#Munkene i klostret beskytter dig mod onde fjender og onde ånder, til gengælde tjener du ingen penge.");
		bw.newLine();
		bw.write("blackCave");
		bw.newLine();
		bw.write("Sort hule#Foran den sorte hule løber alle dine lejesoldater væk i frygt og du mister 70.");
		bw.newLine();
		bw.write("mountainHuts");
		bw.newLine();
		bw.write("Bjerg hytter#Du finder en gruppe hytter i bjergene med søde folk, som sælger dig ædelsten. Modtag 60.");
		bw.newLine();
		bw.write("werewall");
		bw.newLine();
		bw.write(
				"Varulve væg#På din rejse mod nord møder du en mur befæstet med varulve. I din flugt fra varulvene møder du en handelskaravane som du betaler 80 for hurtigt at komme væk. Slå igen.");
		bw.newLine();
		bw.write("pit");
		bw.newLine();
		bw.write("Dypt hul#Du falder ned i et dybt hul og mister 50 i dine strabadser for at komme ud.");
		bw.newLine();
		bw.write("goldmine");
		bw.newLine();
		bw.write("Guldmine#Under en udgravning efter fossiler finder du en guldmine! Du får 650!");
		bw.newLine();
		bw.write("negativeSaldo");
		bw.newLine();
		bw.write("Gudskelov for kommunismen. Staten har eftergivet din gæld. Din saldo er nu 00.00");
		bw.newLine();
		bw.write("rules");
		bw.newLine();
		bw.write("Regler:#Velkommen til CDIO 2 terningespil#"
				+ "Spillet består af to spillere og to terninger. Spillerne skiftes til at slå med terningerne#"
				+ "Spillerne starter med en pengebeholdning på 1000, og det gælder om, at være først til at få 3000 point.");
		bw.newLine();
		bw.close();
	}

}

