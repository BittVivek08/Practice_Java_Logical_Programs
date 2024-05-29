package number;

import java.util.Arrays;
import java.util.List;

public class SecondMinSecondMax {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 17, 54, 14, 14, 33, 451, -11);
		
		System.out.println("Original list :: " + list);
		
		System.out.println("================================================");
		
		Integer secondMin = list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		
		System.out.println("Second Minimum Element from the list is :: " + secondMin);
		
		System.out.println("============================================");
		
		Integer secondMax = list.stream().distinct()
				.sorted((a,b) -> Integer.compare(b, a)).skip(1)
				.findFirst().orElse(null);
		
		System.out.println("Second Maximum Element from the list is :: " + secondMax);

	}

}
