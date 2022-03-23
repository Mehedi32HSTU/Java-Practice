package OOP_with_java;



public class ExceptionHandling {
	public static void main(String args[]) {
		try
		{
			int arr[]=null;
			arr[4]=8;
			int arr1[]=new int[5];
			int m = arr1[7];
			int i=5;
			int j=4;
			int k=i/j;
			System.out.println("Result is : "+k);
		}
		catch (ArithmeticException e) {
			System.err.println("Division by zero is not allowed.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array index is not in range.");
		}
		catch (NullPointerException e) {
			System.err.println("Null point Exception.");
		}
		catch (Exception e) {
			System.err.println("Exception occured :"+e);
		}
		finally {
			System.out.println("Finally block executed.");
		}
		
	}

}
