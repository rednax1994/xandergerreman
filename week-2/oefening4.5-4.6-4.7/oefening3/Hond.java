package oefening3;

public class Hond extends Huisdier{
	
	public Hond(String naam){
		super(naam);
	}
	
	public void maakGeluid(){
		System.out.println("geluid van hond: woef!");
	}
	
	public void kwispel(){
		System.out.println("hond kwispel");
	}

}
