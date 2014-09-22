package BusinessEntityDomain;

public class Vak {
	private String omschrijving;
	
	public Vak(String omschrijving){
		this.omschrijving = omschrijving;
	}
	
	public String toString() {
		return omschrijving;
	}
}
