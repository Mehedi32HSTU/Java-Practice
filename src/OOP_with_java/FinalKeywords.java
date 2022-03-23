package OOP_with_java;

class FinalMethodsAndVariables
{
	final int num=90;
//	num=80; // this will give an error.
	public final void show()
	{
		System.out.println("In final method show.");
	}	
}
final class FinalClass
{
	int num=90;
//	num=80; // this will give an error.
	public void finalClassShow()
	{
		System.out.println("In FinalCLass method show.");
	}
}
//class InheriteFinalClass extends FinalClass
//{
//	//This will give an error as final classes can't be inherited by any other classes.
//	
//}

class InheriteClassMethods extends FinalMethodsAndVariables
{
//	@Override
//	public void show()
//	{
//	  //this will give an error as- can not override final methods.
//	}
}

public class FinalKeywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheriteClassMethods obj1= new InheriteClassMethods();
		obj1.show();
		FinalClass obj2=new FinalClass();
		obj2.finalClassShow();

	}
}
