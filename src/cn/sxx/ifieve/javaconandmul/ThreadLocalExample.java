package cn.sxx.ifieve.javaconandmul;

public class ThreadLocalExample {
	public static class myRunnable implements Runnable{
		private ThreadLocal<Integer> threadLocal =
				new ThreadLocal<Integer>();
		
		@Override
		public  void run() {
			threadLocal.set((int)(Math.random() * 100D));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(threadLocal.get());
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		myRunnable myRunnable = new myRunnable();
		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}
}
