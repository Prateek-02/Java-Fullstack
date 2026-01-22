package Thread;

public class Main2 implements Runnable{
	
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		Main2 m1 = new Main2();
		Thread t1 = new Thread(m1);
		
		t1.start();
	}

}
