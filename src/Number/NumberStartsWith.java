package number;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWith {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(25,21,54,78,23,69,28);
		
		list.stream().map(s -> s + "").filter(s -> s.startsWith("2")).forEach(System.out::println);

	}

}
