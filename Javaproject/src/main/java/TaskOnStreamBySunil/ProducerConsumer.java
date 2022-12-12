package TaskOnStreamBySunil;

import java.util.LinkedList;

public class ProducerConsumer {
			
		LinkedList<Integer> list = new LinkedList<>();
		
		
		public void produce() throws InterruptedException{
			
			int value = 0;
			
			while(true) {
				synchronized (this) {
					
				
				
				while(list.size()>0) {
					wait();
					
					System.out.println("produced data "+ value);
				}
					list.add(value);
					value++;
					notify();
					Thread.sleep(1000);
				}
			}
			}
		
		
		public void consumer()throws InterruptedException{
			
			while(true) {
				synchronized (this) {
					
				
				
				while(list.size()==0) {
					wait();
				}
				int value = list.removeFirst();
				System.out.println("consumer consumed the data " + value );
				 
				notify();
				Thread.sleep(1000);
			}
		}
			}
		
	}
	
	
	/**
	 * java.lang.IllegalMonitorStateException: we'll get this exception if we call one of the wait(), notify(),
	 *  or notifyAll() methods of the Object class outside of a synchronized block.
	 */
	

