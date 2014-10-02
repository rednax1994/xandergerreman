package taskThreadDemoMoja;

public class PrintNumMoja implements Runnable {

	private int invoer;
	private int i;
	
	public PrintNumMoja(int invoer){
		this.invoer = invoer;
	}
	
	@Override
	public void run() {
		for(i=0; i<=invoer; i++)
			System.out.print(i);

	}

}
