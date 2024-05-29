package practiceString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStartingWithChar {

	public static void main(String[] args) {
		
	List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
	
	System.out.println("Original fruit name :: " + fruits);
	
	char startingWith = 'b';
	
	long count = fruits.stream().filter(f -> f.startsWith(String.valueOf(startingWith))).count();
	
	System.out.println("Number of fruits which are starting with char a :: " + count);
	
	List<String> nameOfFruit = fruits.stream().filter(fruit -> fruit
			.startsWith(String.valueOf(startingWith)))
	        .collect(Collectors.toList());
	
	System.out.println("Name of the fruit starting with character a :: " + nameOfFruit);

	}

}
