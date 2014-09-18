package BusinessEntityDomain;

import java.util.ArrayList;

public class Dierenwinkel {

	private ArrayList<Huisdier> lijst;

	public void voegToe(Huisdier dier) {
		lijst.add(dier);
	}

	public void printOverzicht() {

		for (Huisdier dier : lijst) {
			System.out.println("Naam: " + dier.getNaam());
		}
	}
}
