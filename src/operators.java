
public class operators {
	public static void main(String arg[]) {
		int x=12,y=4;
		int a1=x+y;
		a1+=5;
		a1++;
		++a1;
		a1-=3;
		a1--;
		--a1;
		
		int a2=x-y;
		int a3=x*y;
		double a4=(double)(x/y);
		int a5=x%y;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		int b=a1++;
		System.out.println(b+" "+a1);
		
		
		
	}

}
