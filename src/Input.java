import java.util.Scanner;

public class Input {
	public static void main(String args[]) {
		Scanner myObj=new Scanner(System.in);
		System.out.print("Enter Name, age and salary: ");
		String name=myObj.nextLine();
		int age=myObj.nextInt();
		double salary=myObj.nextDouble();
		System.out.println(name+" "+age+" "+salary);
		int n=10;
		int[] day=new int[n];
		for(int i=0;i<10;i++)
		{
			day[i]=myObj.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(day[i]+" ");
		}
		String fname,lname;
		fname=myObj.next();
		lname=myObj.next();
		System.out.println(fname+"\n2345 "+lname);
		
		
	}
}
