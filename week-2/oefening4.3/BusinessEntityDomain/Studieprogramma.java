package BusinessEntityDomain;

import java.util.ArrayList;

public class Studieprogramma {
	private ArrayList<Vak> vaklijst;
	private Datum startdatum;
	private Datum einddatum;
	
	public Studieprogramma(Datum startdatum, Datum einddatum){
		this.startdatum = startdatum;
		this.einddatum = einddatum;
		vaklijst = new ArrayList<Vak>();
	}
}
