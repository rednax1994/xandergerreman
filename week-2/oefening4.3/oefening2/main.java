package oefening2;

public class main {

	public static void main(String[] args) {
		Studieprogramma sp1 = new Studieprogramma(new Datum(10, 06, 2010), new Datum(10, 06, 2016));
		Student st1 = new Student("Xander Gerreman", 1424, sp1 , new Datum(10, 06, 1994));
		
		sp1.voegVakToe("Biologie");
		sp1.voegVakToe("Aardrijkskunde");
		sp1.voegVakToe("Informatica");
		
		System.out.println("Studentnaam: " + st1.getNaam());
		System.out.println("Studentnr: " + st1.getNr());
		System.out.println("Student geboortedatum: " + st1.getGebDatum());
		System.out.println();
		System.out.println("Vaklijst voor periode van " + sp1.getStart() + " tot " + sp1.getEind());
	
		int i = 1;
		for(Vak vak : sp1.getVaklijst()){
			System.out.println("vak " + i + ": " + vak.toString());
	        i ++;
		}
		
	}

}
