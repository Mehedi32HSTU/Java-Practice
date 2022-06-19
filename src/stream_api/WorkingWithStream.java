package stream_api;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WorkingWithStream {
	public static void main(String[] args) {
		
		List<String> stringList = List.of("Mehedi","Hasan","Tasnia","Prosun");
		List<String> resultList = stringList.stream()
				.filter(a -> a.length() <= 6).sorted()
				.collect(Collectors.toList());

		System.out.println(resultList);
		
		System.out.println(stringList.stream().sorted().dropWhile(null)
		.limit(6).map(a -> a.length() < 6).collect(Collectors.toList()));
	}

}
