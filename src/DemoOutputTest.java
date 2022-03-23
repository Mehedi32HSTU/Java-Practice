public class DemoOutputTest {
	public static void main(String[] args) {
		System.out.println("Hello"+5+5);
		System.out.println(5+5+"Hello");
		System.out.println(5*5+"Hello");
		System.out.println(5*5+"Hello"+5*5);
		System.out.println("Hi"+5+5+"Hello");
		System.out.println("Hi"+5*5+"Hello");
		Integer a=10;
		Integer b =new Integer(15);
		System.out.println(a.toString());
		System.out.println(Integer.toString(a));
		System.out.println(Integer.toString(b));
	}
}
