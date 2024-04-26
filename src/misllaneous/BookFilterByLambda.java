package misllaneous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookFilterByLambda {

	public static void main(String[] args) {
		
		List<Book> book = new ArrayList<>();
		
		book.add(new Book(101, "Core Java", 450));
		book.add(new Book(102, "Advance Java", 1450));
		book.add(new Book(103, "Spring Framework", 958));
		book.add(new Book(104, "Hibernate", 740));
		book.add(new Book(105, "Spring Boot", 620));
		book.add(new Book(106, "Microservices", 1136));
		
		List<String> result = book.stream().filter(b -> b.getPages() > 600)
				                           .map(b -> b.getName())
				                           .collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println("=============================================");
		
		for(String d : result) {
			System.out.println(d);
		}
		
		System.out.println("===========================================");
		
		// Sorting(Ascending) books by name
		book.sort(Comparator.comparing(Book :: getName));
		
		for(Book b : book) {
			System.out.println(b);
		}
		
		System.out.println("=============================================");
		
		// Sorting(Descending order) books by name
		book.sort(Comparator.comparing(Book :: getName, Comparator.reverseOrder()));
		
		for (Book c : book) {
			System.out.println(c);
		}

	}

}
