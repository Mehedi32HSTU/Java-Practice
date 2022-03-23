package OOP_with_java;

class Hii implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
class Helloo implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
public class MultithreadingRunnableInterface {
	public static void main(String args[])
	{
		Runnable obj1=new Helloo();
		Runnable obj2 =new Hii();
		
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		
		th1.start();
		try {Thread.sleep(20);} catch (Exception e) {}
		th2.start();
		
		
	}
}

