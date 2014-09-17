package BusinessEntityDomain;

import java.util.ArrayList;

public class Bestelling {
	private Klant klant;
	private ArrayList<Product> bestellijst;

	public Bestelling(Klant klant, Product product) {
		this.klant = klant;
		bestellijst = new ArrayList<Product>();
	}

	public void print() {
		System.out.println("Naam klant: " + klant.getNaam());
		System.out.println("Nummer klant: " + klant.getNummer());
		
		for(Product product : bestellijst){
			System.out.println("Prijs: " + product.getPrijs());
			System.out.println("Omschrijving: " + product.toString());
		}
	}
}
