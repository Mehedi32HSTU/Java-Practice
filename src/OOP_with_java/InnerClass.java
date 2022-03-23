package OOP_with_java;

/*
 * Inner class can be used :
 * 		Static class
 * 		Member class
 * 		Annonymous class
 * 
 */

class Outer
{
	int a;
	public void show()
	{
		System.out.println("Outer class");
	}
//	class Inner			  // can declare a class as member class 
	static class Inner   // can declare a class as static class
	{
		public void display()
		{
			System.out.println("Inner class");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outer obj =new Outer();
		obj.show();
		
//		Outer.Inner obj1 = obj.new Inner();
		Outer.Inner obj1 = new Outer.Inner();  //For static class inner
		obj1.display();
		

	}

}
