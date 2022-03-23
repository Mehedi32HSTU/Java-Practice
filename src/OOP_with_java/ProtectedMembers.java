package OOP_with_java;

class BaseClass1{
	protected int protectedMember=10;
	private int privateMember=50;
//	protectedMember1=10;
	public void printHello() {
		System.out.println("Print hello world");
	}
	
}

class ChildClass1 extends BaseClass1{
	public void printchild1() {
		System.out.println("Print hello world in child 1 protected : "+protectedMember);
//		System.out.println("Print hello world in child 1 private : "+privateMember);  // Private members are not accessible in child class
	}
}

class ChildClass2 extends ChildClass1{
	public void printchild2() {
		System.out.println("Print hello world in child 2" + protectedMember);
	}
}


public class ProtectedMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass2 child = new ChildClass2();
		child.printchild2();

	}

}
