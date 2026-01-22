package Thread;

public class Main1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread is Running...");
	}

	public static void main(String[] args) {
		Main1 m1 = new Main1();
		Thread t1 = new Thread(m1);
		t1.start();
	}

}
