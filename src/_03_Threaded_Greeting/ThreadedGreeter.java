package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int num = 0;
	public ThreadedGreeter(int n) {
		num = n;
	}
	@Override
	public void run() {
		System.out.println("Hello from thread number: " + num);
		if (num<50) {
			Thread t = new Thread(new ThreadedGreeter(num+1));
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
