package OOP_with_java;

class AnonymousA
{
	public void show()
	{
		System.out.println("I am class A");
	}
}

public class AnonymousClass {
	public static void main(String args[])
	{
		AnonymousA obj=new AnonymousA()
				{
					public void show()
					{
						System.out.println("I am Anonymous Class");
					}
				};
		obj.show();
	}

}
