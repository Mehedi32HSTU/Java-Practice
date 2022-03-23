package OOP_with_java;

class Hi extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}

public class MultithreadingIntro {
	public static void main(String args[])
	{
		Hello obj1=new Hello();
		Hi obj2 =new Hi();
		obj1.start();
		try {Thread.sleep(20);} catch (Exception e) {}
		obj2.start();
//		obj1.show();
//		obj2.show();
		
	}

}
