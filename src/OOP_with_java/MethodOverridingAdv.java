package OOP_with_java;

class ClassA
{
	void doSum(int a)
	{
		System.out.println("Class A ,doSum with a");
	}
	void doSum(int a,int b)
	{
		System.out.println("Class A ,doSum with a and b");
	}
	
}
class ClassB extends ClassA
{
	void doSum(int a,int b, int c)
	{
		System.out.println("Class B ,doSum with a , b and c");
	}
	
}
public class MethodOverridingAdv {
	public static void main(String args[]) {
		ClassB objB=new ClassB();
		objB.doSum(0);
		objB.doSum(0,1);
		objB.doSum(0,1,2);
		
//		ClassA objB=new ClassB();
//		objB.doSum(0,1,2);		// this will occure an error, we can override only those methods
								 // which are common in both class
		
		
		
		
	}

}
