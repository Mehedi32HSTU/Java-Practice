package OOP_with_java;

class Addition
{
	int x,y,result;
	public Addition() {
		System.out.println("Hello addition");
		
	}
	void add()
	{
		result=x+y;
	}
}
class Addit extends Addition{

	public Addit() {
		System.out.println("Hello Addit");
	}
	
	
}

public class Class_and_Object {
	public static void main(String args[]) {
		Addition obj1= new Addition();
		Addition obj2= new Addition();
		obj1.x=1;
		obj1.y=2;
		obj1.add();
		System.out.println(obj1.result);
		obj2=obj1; //Copy all value of obj1 into obj2
		System.out.println(obj2.y);
		Addit addit= new Addit();
		
	}

}
