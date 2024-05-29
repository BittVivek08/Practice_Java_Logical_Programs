package number;

import java.util.Arrays;
import java.util.List;

public class Filter_Sort {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(23,6,10,1,5,2,8);
		
		list.stream().filter(t -> t > 4).sorted().forEach(t -> System.out.println(t));

	}

}
