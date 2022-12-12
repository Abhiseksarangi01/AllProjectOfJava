package TaskOnStreamBySunil;

class  abc extends Thread {
	@Override
   public void run()
   {
   		try
		{
   		for(int i=1;i<=5;i++)
   		{
   			System.out.println("Abhisek");
   			abc.sleep(1000);
   		}
	}
	catch(InterruptedException i)
	{
	
	}
	
	}

}

class MultithreadingExtendsThreadClass {
	public static void main(String[] args) throws InterruptedException{
		abc thread1 = new abc();
		thread1.start();
		
		abc thread2 = new abc();
		thread2.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("shukla");
   			Thread.sleep(1000);

		}

	}
}
