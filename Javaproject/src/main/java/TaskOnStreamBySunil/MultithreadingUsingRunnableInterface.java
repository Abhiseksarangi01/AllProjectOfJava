package TaskOnStreamBySunil;

     class A implements Runnable 
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println("My child thread");
		}
	}
}
      class MultithreadingUsingRunnableInterface {
    	  
	public static void main(String[] args) {
		 
		A a= new A();
		
		Thread t = new Thread(a);
		t.start();
		
		
		for(int i=1;i<=4;i++)
		{
			System.out.println("main thread");
		}

	}
}



