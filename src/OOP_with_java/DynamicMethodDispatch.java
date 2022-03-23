package OOP_with_java;
class A1
{
	public void show()
	{
		System.out.println("In  A show");
	}
	
	public void config()
	{
		System.out.println("In Config A");	
	}
	public void config2()
	{
		System.out.println("In Config2 A");	
	}
	
}
class B1 extends A1
{
	public void show()
	{
		System.out.println("In B show");
	}
	
	public void config()
	{
		System.out.println("In Config B");
	}
	
}

class C1 extends B1
{
	public void show()
	{
		System.out.println("In C show");
	}
	
	public void config()
	{
		System.out.println("In Config C");
	}
	
	public void hello()
	{
		System.out.println("In Hello C");
	}
	
}

public class DynamicMethodDispatch {
	// run time polymorphism
	public static void main(String[] args) {
//		A1 obj1=new A1();
		A1 obj1=new B1();
//		obj1.
		obj1.show();
		obj1.config();
		
		A1 obj2=new C1();
		obj2.show();
		obj2.config();
		obj2.config2();   // this method is present only in parent class
		obj2.config();
//		obj2).hello();    // This will show error as this is not present in the paren class.
		
	}
}
