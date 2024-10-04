package stream;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(4, 9, 6, 8, 3);
    //    numbers.stream().filter(n -> n > 5 ).forEach(n -> System.out.println(n));
		numbers.stream().filter(n -> n > 5 && n % 2 == 0).forEach(k -> System.out.println(k));
	}

}
