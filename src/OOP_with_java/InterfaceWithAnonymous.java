package OOP_with_java;

interface Abc
{
	void show();
}


public class InterfaceWithAnonymous {
	public static void main(String args[]) {
		Abc obj=new Abc()
				{
					public void show()
					{
						System.out.println("I am Anonymous Class with Interface");
					}
				};
		obj.show();
		
	}

}
