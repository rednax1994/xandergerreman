package personen2;

import java.io.*;
import java.util.ArrayList;

import personen2.persoon2;

public class ObjectenSchrijven {

	public static void main(String[] args) {
		persoon2 p1 = new persoon2("Xander", "Marialaan 9a", "Breda");
		persoon2 p2 = new persoon2("Robbie", "Marialaan 9a", "Breda");
		persoon2 p3 = new persoon2("Matteo", "Marialaan 9a", "Breda");

		ArrayList<persoon2> lijst = new ArrayList<>();

		lijst.add(p1);
		lijst.add(p2);
		lijst.add(p3);

		String filenaam = "/Users/xandergerreman/git/xander-gerreman/week-3/Personen2/personen2/personen.dat";
		try {
			ObjectOutputStream uit = new ObjectOutputStream(
					new FileOutputStream(filenaam));

			uit.writeObject(lijst);
			uit.close();

		} catch (IOException e) {
			System.out.println("Fout bij openen bestand " + filenaam);
			e.printStackTrace();
		}

	}

}
