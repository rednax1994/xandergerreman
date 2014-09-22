public class main {

	public static void main(String[] args) {
		AbstractHuisdier ah1 = new Kat("snoes");
		AbstractHuisdier ah2 = new Hond("bullebak");

		System.out.println("naam dier: " + ah1.getNaam());
		ah1.maakGeluid();
		System.out.println();
		System.out.println("naam dier: " + ah2.getNaam());
		ah2.maakGeluid();
		System.out.println();

	}

}
