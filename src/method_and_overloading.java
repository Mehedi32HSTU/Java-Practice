
import java.util.Scanner;
class Calc
{
	public int add(int m)
	{
		
		System.out.println("Method 1 is called");
		int n=8;
		return m+n;
	}
	public int add(int m,int n)
	{
		System.out.println("Method 2 is called");
		return m+n;
	}
	public double add(double m)
	{
		System.out.println("Method 3 is called");
		double n=9.0;
		return m+n;
	}
	public double add(double m,double n)
	{
		System.out.println("Method 4 is called");
		return (double)(m+n);
	}
}
public class method_and_overloading {
	
	public static void main(String args[]) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		Calc obj=new Calc();
		a=scan.nextInt();
		b=scan.nextInt();
		double x=obj.add(a,b);
		System.out.println(x);
		
	}

}
