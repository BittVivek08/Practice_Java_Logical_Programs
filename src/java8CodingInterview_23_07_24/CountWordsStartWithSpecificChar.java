package java8CodingInterview_23_07_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountWordsStartWithSpecificChar {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("banana", "cherry", "berry", "coconut", "apple", "chocolate");
		
		long count = fruits.stream().filter(fruit -> fruit.startsWith("c")).count();
		
		System.out.println("Total number of fruits starts with c is :: " + count);
		
		System.out.println("=============================");
		
		 List<String> collect = fruits.stream().filter(fruit -> fruit.startsWith("b")).collect(Collectors.toList());
		 List<String> collect2 = collect.stream().map(String :: toUpperCase).collect(Collectors.toList());
		 System.out.println("Name of fruit starts with b is :: ");
		 for(String fruitName : collect2) {
			System.out.println(fruitName);
		 }
		System.out.println("=================");		
		// Convert elements in UPPERCASE	
		System.out.println("All the fruit name is in uppercase :: ");
		fruits.stream().map(String :: toUpperCase).forEach(System.out::println);

	}

}
