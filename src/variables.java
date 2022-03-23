
public class variables {
	public static void main(String args[]) {
		String fname="Mehedi";
		String lname="Hasan";
		int a=15;
		a=20;
		final int bb=21;
//		bb=3;
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(bb+" "+a+" "+fname+lname);
		String full_name=fname+" "+lname;
		System.out.println(full_name);
		
		System.out.println(a);
		System.out.println(bb);
//		bb=3;		//will generate an error as we can't change the value of final varuiable
//		System.out.println(bb);
		float f=5.67f;
		System.out.println(f);
		char c='A';
		System.out.println(c);
		double d=123.567;
		System.out.println(d);
		boolean my_bool=true;
		System.out.println(my_bool);
		
//		Type casting of data type
		
//		int Int=345;
//		double Double=Int;
//		System.out.println(Double);
		
		double Double=345.987;
		int Int=(int)Double;
		System.out.println(Int);
		
		
	}

}
