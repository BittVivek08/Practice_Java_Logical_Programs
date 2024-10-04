package stream;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ashok", "shyam", "Ravi", "Kumud", "Kamla","sonu","sarnath");
		 
		names.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
		System.out.println("============");
		names.stream().filter(n -> n.startsWith("K")).map(k -> k.toUpperCase()).forEach(l -> System.out.println(l));

	}

}
