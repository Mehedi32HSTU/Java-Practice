package OOP_with_java;

@FunctionalInterface
interface Demo1
{
	int num=10;
	void abc();
	static void show()
	{
		System.out.println("This is Show in Demo1 Interface.");
	}
}

class Demo1Impl implements Demo1
{
	int num=15;
	@Override
	public void abc() {
		
		System.out.println("This is abc in Demo1Impl and value of NUM = "+num);
	}
}

public class StaticMethodsInInterface {
	public static void main(String[] args) {
		Demo1.show();
		Demo1Impl obj = new Demo1Impl();
		obj.abc();
	}
}
