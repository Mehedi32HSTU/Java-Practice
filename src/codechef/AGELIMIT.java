package codechef;

import java.util.Scanner;




public class AGELIMIT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int x,y,age;
		for(int i=0;i<testCase; i++) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			age =scanner.nextInt();
			if(age>=x && age < y)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}

}
