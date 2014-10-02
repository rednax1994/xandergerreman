package taskThreadDemoMoja;

public class PrintCharMoja implements Runnable {

	private char letter;
	private int hoeveelheid;
	private int i;
	
	public PrintCharMoja(char letter, int hoeveelheid){
		this.letter = letter;
		this.hoeveelheid = hoeveelheid;
	}
	
	@Override
	public void run() {
		for(i=0; i<=hoeveelheid; i++) 
			System.out.print(letter);

	}

}
