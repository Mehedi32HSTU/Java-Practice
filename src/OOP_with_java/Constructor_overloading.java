package OOP_with_java;

class FirstClass
{
	int x,y,result;
	float z;
	
	public FirstClass()
	{
		System.out.println("Hello, this is constructor 1.");
		result=x+y;
		System.out.println("x = "+x+" and y= "+y+" Result= "+result);
	}
	public FirstClass(int x)
	{
		this.x=x;
		System.out.println("Hello, this is constructor 2.");
		result=x+y;
		System.out.println("x = "+x+" and y= "+y+" Result= "+result);
	}
	public FirstClass(int x, int y)
	{
		this.x=x; // 'this' keyword refers the current object instance
		this.y=y;
		System.out.println("Hello, this is constructor 3.");
		result=x+y;
		System.out.println("x = "+x+" and y= "+y+" Result= "+result);		
	}

}

public class Constructor_overloading {
	public static void main(String args[]) {
		FirstClass obj1= new FirstClass();
		FirstClass obj2= new FirstClass(4);
//		FirstClass obj2= new FirstClass(4);
		FirstClass obj3= new FirstClass(5,9);
		System.out.println(obj3.x+" "+obj3.y);
		
		
	}
}
