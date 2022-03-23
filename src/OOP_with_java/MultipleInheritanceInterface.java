package OOP_with_java;

interface Paren1
{
	public default void show() {
		System.out.println("In Parent1 show().");
	}
}
interface Paren2
{
	public default void show() {
		System.out.println("In Parent2 show().");
	}
}

class Demoimpl implements Paren1, Paren2
{
	@Override
	public void show() {
//		Paren1.super.show();
		Paren2.super.show();
		// TODO Auto-generated method stub
//		System.out.println("In Demo show().");
	}
	
}

public class MultipleInheritanceInterface {

	public static void main(String[] args) {
		Demoimpl obj= new Demoimpl();
		obj.show();
		
	}

}
