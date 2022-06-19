package stream_api;

import java.util.Arrays;
import java.util.List;

public class ForEachAPI {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(10,20, 30,40,50,60,70,80,90,100);
//		values.forEach(i->System.out.println(i));
		
		values.forEach(i->System.out.println(multiply(i,3)));
		values.forEach( ForEachAPI :: doubleIt);  // Method reference
		
	}
	static Integer multiply(Integer x, Integer y) {
		return x*y;
	}
	
	static void doubleIt(Integer x) {
		System.out.println(x*2);
	}

}
