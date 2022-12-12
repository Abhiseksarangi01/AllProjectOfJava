package TaskOnStreamBySunil;

class thread1 extends Thread{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println("This is the first thread");
		}
	}
}

class thread2 extends Thread{
	
	public void run() {
		
		for(int i=1;i<=2;i++)
		{
			System.out.println("This is the second thread");
		}
	}
}


class thread3 extends Thread{
	
	public void run() {
		
		for(int i=1;i<=2;i++)
		{
			System.out.println("This is the third thread");
		}
	}
}


   class MultipleThreads {
	public static void main(String[] args) {
		
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		thread3 t3 = new thread3();
		
		t1.start();
		t2.start();
		t3.start();
		
		/**
		 * priority - sets the thread priority ie : which thread to show more or less according to the priority
		 */
		
		t3.setPriority(Thread.MAX_PRIORITY); 
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		/**
		 * to the current thread , its time , its name , its Id 
		 * 
		 */
		System.out.println("Current running thread  ");
		Thread t = Thread.currentThread();
		
		System.out.println("current thread " + t);
		System.out.println("thread name " + t.getName());
		System.out.println("thread id " + t.getId());
		System.out.println("thread priority " + t.getPriority());
		
		
	}
}
