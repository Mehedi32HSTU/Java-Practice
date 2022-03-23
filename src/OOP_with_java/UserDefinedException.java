package OOP_with_java;


public class UserDefinedException {
	public static void main(String args[])
	{
		int i,j;
		i=9;
		j=1;
		
		try
		{
			int k=i/j;
			if (k==0)
				throw new MyException("Divisor is greater than dividend.");
			System.out.println("Value of division is : "+k);
		}
		catch (MyException e) {
			System.err.println("Error "+e.getMessage());
		}
		finally {
			System.out.println("Operation done, closed.");
		}
	}

}
