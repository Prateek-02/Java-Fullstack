package LambdaFunctions;

public class Lambda5_Thread {
	public static void main(String[] args) {
		//old way with overriding run method
		// Runnable r = new Runnable{public void run(){System.out.println("Old thread);}};
		
		Runnable task = () -> {
			for(int i=1;i<=3;i++) {
				System.out.println("Song "+i+" is playing...");
			}
		};
		
		Thread t = new Thread(task);
		t.start();
	}
	
}
