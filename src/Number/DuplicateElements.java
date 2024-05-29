package number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,89,12,45,65,48,89,45,69,23,69);
		
		Set<Integer> set = new HashSet<>();
		
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
		int size = list.size();
		System.out.println("Number of elements in the given array is : " +size);
	}
	

}
