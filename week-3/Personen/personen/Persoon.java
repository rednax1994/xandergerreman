package personen;

public class Persoon {
	private String naam;
	private String adres;
	private String woonplaats;
	
	public Persoon(String naam, String adres, String woonplaats){
		this.naam = naam;
		this.adres = adres;
		this.woonplaats = woonplaats;
	}
	
	public String getNaam(){
		return naam;
	}
	
	public String getAdres(){
		return adres;
	}
	
	public String getWoonplaats(){
		return woonplaats;
	}
	
}
