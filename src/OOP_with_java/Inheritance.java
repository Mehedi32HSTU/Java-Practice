package OOP_with_java;
import java.lang.*;

class Calculator  //Great Grand Father, Super class also
{
	
	public Calculator() {
		
		System.out.println("In calcula");
		// TODO Auto-generated constructor stub
	}

	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int a, int b)
	{
		System.out.println("In parent");
		return Math.abs(a-b);
	}
}

class CalcAdv extends Calculator	//Grand Father, Sub class
{
	
	public CalcAdv() {
		System.out.println("In child");
		// TODO Auto-generated constructor stub
	}
	@Override
	int sub(int a, int b)
	{
		System.out.println("In child");
		return Math.abs(a-b);
	}
}
class CalcVeryAdv extends CalcAdv	//Father, Sub class
{
	int mult(int a, int b)
	{
		return a*b;
	}
}
class CalcVeryAdv2 extends CalcVeryAdv	// Child, Sub class
{
	int div(int a, int b)
	{
		return a/b;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		CalcVeryAdv2 obj1=new CalcVeryAdv2();
		int res=obj1.add(5, 6);
		System.out.println(res);
		res=obj1.sub(5, 6);
		System.out.println(res);
		res=obj1.mult(5, 6);
		System.out.println(res);
		res=obj1.div(35, 6);
		System.out.println(res);
		int x=10;
		System.out.println(++x);
		System.out.println(x++);
		CalcAdv cal = new CalcAdv();
		System.out.println(cal.sub(7, 5));
		
	}

}
