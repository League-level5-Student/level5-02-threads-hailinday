package _04_Thread_Pool.tests;

public class ThreadPoolTester {
	public static void main(String[] args) {
		workQueue wq = new workQueue();
		System.out.println("Total threads:" + wq.getThreadCount());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wq.shutdown();
	}
}
