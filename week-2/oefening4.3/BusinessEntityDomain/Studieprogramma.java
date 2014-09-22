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
	
	public void voegVakToe(String subject){
		vaklijst.add(new Vak(subject));
	}
	
	public ArrayList<Vak> getVaklijst(){
		return vaklijst;
	}
	
	public String getStart(){
		return startdatum.getDag() + "-" + startdatum.getMaand() + "-" + startdatum.getJaar();
		
	}
	
	public String getEind(){
		return einddatum.getDag() + "-" + einddatum.getMaand() + "-" + einddatum.getJaar();
		
	}
	
}
