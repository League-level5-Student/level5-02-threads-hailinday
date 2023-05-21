package _04_Thread_Pool.tests;

public class ThreadPoolTester {
//	public static void main(String[] args) {
//		WorkQueue wq = new WorkQueue();
//		System.out.println("Total threads:" + wq.getThreadCount());
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		wq.shutdown();
//	}
	public static void main(String[] args) {
		WorkQueue wq = new WorkQueue();
		for (int i = 0; i < 1000; i++) {
			int x = i;
			Job j = () ->{
				System.out.println("Printing " + x + " from thread # " + Thread.currentThread().getId());
			};
			wq.addJob(j);
		}
		wq.shutdown();
	}
}
