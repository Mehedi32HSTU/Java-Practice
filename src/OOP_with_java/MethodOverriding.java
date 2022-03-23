package OOP_with_java;

class AA							// Parent Class
{
	public void show()
	{
		System.out.println("In A");
	}
}

class BB extends AA					// Child Class
{
	@Override
	public void show()				// Child Class method will always override the parent class method.
	{								
		super.show();				// super is used to refer the parent class object.
		System.out.println("In B");
		super.show();
	}
	public void show(int a) {
		System.out.println("In B with overloaded "+a);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		BB obj=new BB();
		obj.show();
		obj.show(10);
	}

}
