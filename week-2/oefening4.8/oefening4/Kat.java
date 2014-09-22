package oefening4;

import oefening3.Huisdier;

public class Kat extends Huisdier{
	
	public Kat(String naam){
		super(naam);
	}

	public void maakGeluid(){
		System.out.println("geluid van kat: miauw!");
	}
	
	public void spin(){
		System.out.println("kat spint!");
	}
	
}
