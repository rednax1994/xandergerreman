package oefening3;

public class Huisdier {
	private String naam;
	
	public Huisdier(String naam){
		this.naam = naam;
	}
	
	public String getNaam(){
		return naam;
	}
	
	public void maakGeluid(){
		System.out.println("!");
	}
	
}
