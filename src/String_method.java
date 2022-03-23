
public class String_method {
	public static void main(String args[]) {
		String s1="Hello Mehedi";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		String s2="Please locate where 'locate' occurs! Where";
		System.out.println(s2.indexOf("where"));
		System.out.println(s2.concat(s1));
		System.out.println(s2.charAt(15));
		System.out.println(s2.codePointBefore(15));
		System.out.println(s2.codePointCount(1,15));
		String s3="Where";
		System.out.println(s2.endsWith(s3));
		System.out.println(s2.startsWith("Pl"));
		
		
		
		
		
	}

}
