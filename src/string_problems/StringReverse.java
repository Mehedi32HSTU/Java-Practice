package string_problems;

import java.util.Scanner;


class ReverseGivenString{
	public String str = new String();
	public ReverseGivenString() {
		
	}

	public ReverseGivenString(String str) {
		this.str = str;
		
	}
	
	public String reverseString() {
		
//		char[] tempCharArray = this.str.toCharArray();
//		int left = 0, right = this.str.length()-1;
//		for(left=0; left<right; left++, right--) {
//			char temp = tempCharArray[left];
//			tempCharArray[left] = tempCharArray[right];
//			tempCharArray[right] = temp;
//		}
		StringBuffer tempString = new StringBuffer();
//		for(char ch : tempCharArray) {
//			tempString.append(ch);
//		}
		
		for(int i=str.length()-1; i>=0; i--) tempString.append(str.charAt(i));
		this.str = tempString.toString();
		
		return this.str;
	}
}

public class StringReverse {
	public static void main(String []args) {
//		Scanner sc = new Scanner(System.in);
//		String givenString = new String(sc.nextLine());
		String givenString = new String("Hello World");
		ReverseGivenString reverse = new ReverseGivenString(givenString);
		System.out.println("String Before reverse : "+reverse.str);
		reverse.reverseString();
		System.out.println("String After reverse : "+reverse.str);
	}
}
