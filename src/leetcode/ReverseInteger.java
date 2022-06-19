package leetcode;

public class ReverseInteger {
	public static int reverseNumber(int x) {
		long result = 0;
		while(x!=0) {
//			System.out.println(x);
			if((result * 10 + (x%10)) < Integer.MIN_VALUE || (result * 10 + (x%10)) > Integer.MAX_VALUE) return 0;
			result = result * 10 + (x%10);
			x = x / 10;
		}
		return (int) result;
	}

	public static void main(String[] args) {
		int number = -123;
		System.out.println(reverseNumber(number));
	}

}
