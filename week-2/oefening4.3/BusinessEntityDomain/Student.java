package BusinessEntityDomain;

public class Student {
	private String naam;
	private int nr;
	@SuppressWarnings("unused")
	private Studieprogramma programma;
	private Datum gebdatum;
	
	public Student(String naam, int nr, Studieprogramma programma, Datum gebdatum){
		this.naam = naam;
		this.nr = nr;
		this.programma = programma;
		this.gebdatum = gebdatum;
	}
	
	public String getNaam() {
		return naam;
	}

	public int getNr() {
		return nr;
	}
	
	public String getGebDatum(){
		return gebdatum.getDag() + "-" + gebdatum.getMaand() + "-" + gebdatum.getJaar();
	}
}
