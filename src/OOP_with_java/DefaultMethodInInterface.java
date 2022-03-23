package OOP_with_java;

@FunctionalInterface			// In functional Interface, we can have only one abrtract method but can have one or more default methods.
interface DefaultInterface
{
	void show();
	
//	Any number of default methods can be declared and defined by using default keyword.
	
	default void defaultMethod1()
	{
		System.out.println("In default Method 1");
	}
	default void defaultMethod2()
	{
		System.out.println("In default Method 2");
	}
	default void defaultMethod3()
	{
		System.out.println("In default Method 3");
	}
}

class DemoImplementation implements DefaultInterface
{

	@Override
	public void show() {
		System.out.println("In show method");
	}
//	Default methods can also be overriden.
	public void defaultMethod2() {
		System.out.println("In default Method 2 of Implementation.");
	}	
}

public class DefaultMethodInInterface {
	public static void main(String[] args)
	{
		DemoImplementation obj = new DemoImplementation();
		obj.show();
		obj.defaultMethod2();
		obj.defaultMethod3();
		
	}
}
