package BusinessEntityDomain;

public class Student {
	private String naam;
	private int nr;
	private Studieprogramma programma;
	private Datum gebdatum;
	
	public Student(Studieprogramma programma, Datum gebdatum){
		this.programma = programma;
		this.gebdatum = gebdatum;
	}
	
	public String getNaam() {
		return naam;
	}

	public int getNr() {
		return nr;
	}
}
