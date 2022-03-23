package OOP_with_java;

class Calc
{
	public int add(int ...args)
	{
		int sum=0;
//		for(int i=0,j=0;i<args.length; i++)
		for(int i : args)
		{
//			System.out.print(j+" ");
//			j++;
//			sum+=args[i];
			sum+=i;
			
		}
		return sum;
	}
}

public class VarArgs {

	public static void main(String[] args) {
		Calc obj= new Calc();
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
//		int x=obj.add(1,2,3,4,5,6,7,8,9,10);
		int x=obj.add(arr);
		
		System.out.println(x);

	}

}
