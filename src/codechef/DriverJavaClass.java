package codechef;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class DriverJavaClass {
	public static void solution() {
		
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		for(int tc = 0 ; tc< testCase; tc++) {
			
			int length = scanner.nextInt();
			int distinct = scanner.nextInt();
			String alphabetSequence = "abcdefghijklmnopqrstuvwxyz";
			if(length%2==0) {
				if(distinct<=length/2) {
					int leftLength = (length-(distinct*2))/2;
					StringBuffer leftString = new StringBuffer();
					StringBuffer rightString = new StringBuffer();
					StringBuffer middleLeftString = new StringBuffer();
					StringBuffer middleRightString = new StringBuffer();
					for(int i=0;i<leftLength;i++){
						leftString.append('a');
						rightString.append('a');
					}
					for(int i=0;i<distinct;i++) {
						middleLeftString.append(alphabetSequence.charAt(i));
						middleRightString.append(alphabetSequence.charAt(i));
					}
					middleRightString.reverse();
					System.out.println(leftString.append(middleLeftString).append(middleRightString).append(rightString));
				}
				else
					System.out.println(-1);
			}
			else {
				if(distinct<=(length+1)/2) {
					int reserved = (distinct*2)-1;
					int leftLength = length - reserved;
					StringBuffer leftString = new StringBuffer();
					StringBuffer rightString = new StringBuffer();
					StringBuffer middleLeftString = new StringBuffer();
					StringBuffer middleRightString = new StringBuffer();
					for(int i=0;i<leftLength;i++){
						leftString.append('a');
						rightString.append('a');
					}
					for(int i=0;i<distinct-1;i++) {
						middleLeftString.append(alphabetSequence.charAt(i));
						middleRightString.append(alphabetSequence.charAt(i));
					}
					middleLeftString.append(alphabetSequence.charAt(distinct-1));
					middleRightString.reverse();
					System.out.println(leftString.append(middleLeftString).append(middleRightString).append(rightString));
				}
				else
					System.out.println(-1);
			}
			
		}

	}
	
	public static void main(String[] args) {
		solution();
	}
}
