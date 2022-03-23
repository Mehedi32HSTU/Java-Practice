package OOP_with_java;

public class MultithreadingLambdaExpression {
	public static void main(String args[]) throws InterruptedException
	{
		Thread th1 = new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hi");
				try {Thread.sleep(500);} catch (Exception e) {}
			}
		});
		Thread th2 = new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello");
				try {Thread.sleep(500);} catch (Exception e) {}
			};
		});
		
		th1.setName("Hi Thread");
		th2.setName("Hello Thread");
		System.out.println(th1.getName());
		System.out.println(th2.getName());
		
		th1.setPriority(1); 
		th2.setPriority(10);
//		th1.setPriority(Thread.MIN_PRIORITY);  // 1
//		th1.setPriority(Thread.MAX_PRIORITY);  //10
//		th1.setPriority(Thread.NORM_PRIORITY); //5
		
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		
		
		th1.start();
		try {Thread.sleep(20);} catch (Exception e) {}
		th2.start();
		
		th1.join();
		th2.join();
		System.out.println(th1.isAlive());
		System.out.println(th2.isAlive());
		
		System.out.println("..........Finished..........");
	}

}
