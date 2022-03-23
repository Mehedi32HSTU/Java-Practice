package OOP_with_java;

class Emp
{
	int eid;
	int esalary;
	static String ceo;
	
	static
	{
		System.out.println("Static block1 executed.");
		ceo="Shakhawat";
	}
	
	public Emp(int eid, int esalary)
	{
		System.out.println("Constructor block executed.");
		this.eid=eid;
		this.esalary=esalary;
	}
	
	public void show()
	{
		System.out.println("Id : "+eid+", Salary : "+esalary+", CEO : "+ceo);
	}
}

public class StaticKeyword {
	
	static void myStaticMethod()
	{
		System.out.println("Static methods can be called without creating objects");
	}
	public void myPublicMethod() 
	{
	    System.out.println("Public methods must be called by creating objects");
	}
	
	public static void main(String args[]) {
		
		myStaticMethod();
		StaticKeyword helloObj= new StaticKeyword();
		helloObj.myPublicMethod();
		
		Emp obj1= new Emp(4,10000);
		Emp obj2= new Emp(5,15000);
//		obj1.eid=1;
//		obj1.esalary=5000;
//		Emp.ceo="Shakhawat";
//		obj2.eid=2;
//		obj2.esalary=6000;
		obj1.show();
		obj2.show();
//		obj2.ceo="Hasan";
//		obj1.show();
//		obj2.show();
		
		
	}

}
