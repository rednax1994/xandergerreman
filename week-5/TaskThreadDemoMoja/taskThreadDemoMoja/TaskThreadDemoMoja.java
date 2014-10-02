package taskThreadDemoMoja;

public class TaskThreadDemoMoja {

	public static void main(String[] args) {
		//create tasks
		Runnable printA = new PrintCharMoja('a', 100);
		Runnable printB = new PrintCharMoja('b', 100);
		Runnable print100 = new PrintNumMoja(100);
		
		//Create threads
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);
		
		//start threads
		//thread1.start();
		//thread2.start();
		//thread3.start();
		
		//enter
		System.out.println();
		
		//run threads
		//thread1.run();
		//thread2.run();
		//thread3.run();
		
		

	}

}
