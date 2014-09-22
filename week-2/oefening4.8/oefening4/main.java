package oefening4;

import oefening3.Dierenwinkel;
import oefening3.Hamster;
import oefening3.Hond;
import oefening3.Kat;

public class main {

	public static void main(String[] args) {
		Hamster hamster1 = new Hamster("piet");
		Hond hond1 = new Hond("sloeber");
		Kat kat1 = new Kat("sissy");
		
		Dierenwinkel dw1 = new Dierenwinkel("paddie");
		
		dw1.voegToe(hamster1);
		dw1.voegToe(kat1);
		dw1.voegToe(hond1);
		
		System.out.println("naam winkel: " + dw1.getNaam());
		System.out.println("dieren in dierenwinkel:");
		dw1.printOverzicht();
		
		System.out.println();
		
		System.out.println("geluiden van de dieren");
		System.out.println("naam: " + hamster1.getNaam());
		hamster1.maakGeluid();
		
		System.out.println();
		System.out.println("naam: " + hond1.getNaam());
		hond1.maakGeluid();
		hond1.kwispel();
		System.out.println();
		
		System.out.println("naam: " + kat1.getNaam());
		kat1.maakGeluid();
		kat1.spin();
		System.out.println();

	}

}
