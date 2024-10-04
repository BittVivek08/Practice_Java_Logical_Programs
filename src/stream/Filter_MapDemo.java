package stream;

import java.util.Arrays;
import java.util.List;

public class Filter_MapDemo {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("ashok", "shyam", "Ravi", "Kumud", "Kamla","sonu","sarnath");
		
		names.stream()
		.filter(name -> name.startsWith("s"))
		.map(name -> name + " - " + name.length())
		.forEach(name -> System.out.println(name));

	}

}
