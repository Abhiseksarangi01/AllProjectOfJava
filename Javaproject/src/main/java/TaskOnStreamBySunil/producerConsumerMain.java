package TaskOnStreamBySunil;

public class producerConsumerMain {

	public static void main(String[] args) throws InterruptedException {

		ProducerConsumer pc = new ProducerConsumer(); //object creation

		Thread t1 = new Thread(new Runnable() { // implementing the runnable interface which provides us run method 

			@Override
			public void run() {
				try {
					pc.produce();  //calling the method using the object
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});
		
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
			try {
				pc.consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
		});
		
		t1.start();
		t2.start();
		
		/**
		 *  join () - allows one thread to wait until another thread completes its execution
		 */
		t1.join();
		t2.join();
	}
}