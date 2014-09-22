package oefening3;

import java.util.ArrayList;

public class Dierenwinkel {

	private ArrayList<Huisdier> lijst;
	private String naam;
	
	public Dierenwinkel(String naam){
		this.naam = naam;
		lijst = new ArrayList<Huisdier>();
	}

	public void voegToe(Huisdier dier) {
		lijst.add(dier);
	}

	public String getNaam(){
		return naam;
	}
	
	public void printOverzicht() {
		int i = 1;
		for (Huisdier dier : lijst) {
			System.out.println("Naam dier "+ i + ": " + dier.getNaam());
			i++;
		}
	}
}
