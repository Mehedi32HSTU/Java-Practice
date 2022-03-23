package OOP_with_java;

class OuterClass
{
	int a, b;
	static String name ="Mehedi"; 
	class InnerClass
	{
		void accessMethod() {
			a=5;b=6;
			System.out.println("Inner Class "+a+" "+b);
		}
	}
	static class StaticClass
	{
		void accessMethod() {
//			a=1;b=2;		//We can't use any non static method or variable in the static class or method.
			System.out.println("Static Class");
		}
	}
}

public class StaticAndInnerClass {
	
	public static void main(String[] args) {
		OuterClass outerClass=new OuterClass(); // object creation Outer Class
		System.out.println("A = "+outerClass.a+" B = "+outerClass.b+" Name : "+outerClass.name);
		OuterClass.InnerClass innerClass= outerClass.new InnerClass();
		innerClass.accessMethod();
//		outerClass.a=9;  //This will work fine.
		OuterClass.StaticClass staticClass= new OuterClass.StaticClass();
		staticClass.accessMethod();
//		staticClass.a=10; //this will cause an error, we can't use any non static type in static.
	}
}
