package personen2;

import java.io.*;
import java.util.*;

public class ObjectenLezen {

	public static void main(String[] args) {
		ArrayList<persoon2> persoonlijst = new ArrayList<>();
		String filenaam = "/Users/xandergerreman/git/xander-gerreman/week-3/Personen2/personen2/personen.dat";
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					filenaam));

			persoonlijst = (ArrayList<persoon2>) in.readObject();
			in.close();

		} catch (ClassNotFoundException e) {
			System.out.println("onbekende klasse bij inlezen bestand "
					+ filenaam);

		} catch (IOException e) {
			System.out.println("Fout bij openen bestand " + filenaam);
			e.printStackTrace();
		}

		for(persoon2 persoon2 : persoonlijst){
			System.out.println(persoon2.getNaam());
			System.out.println(persoon2.getAdres());
			System.out.println(persoon2.getWoonplaats());
		}
		
	}

}
