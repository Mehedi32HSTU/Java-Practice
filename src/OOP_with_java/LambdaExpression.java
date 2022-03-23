package OOP_with_java;

interface ABC1
{
	void show();
}


public class LambdaExpression {

	public static void main(String[] args) {
		ABC1 obj = () -> System.out.println("I am Lambda Expression with Interface");
		obj.show();
	}
}
