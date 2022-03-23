package OOP_with_java;

class A
{
	public A()
	{
		System.out.println("In A");
		
	}
	public A(int a)
	{
		System.out.println("In A int");
		
	}
}

class B extends A
{
	public B()
	{
//		super(5);
		System.out.println("In B");
	}
	public B(int a)
	{
//		int i=a; // Will cause an error
		super(a);
		System.out.println("In B int");
//		super(a); // Will cause an error, super would be called first in the constructor.
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		B obj=new B(5);
		B obj2=new B();
		
	}

}
