package misllaneous;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> getBooks(){
		
	List<Book> book = new ArrayList<>();
	book.add(new Book(101, "Core Java", 450));
	book.add(new Book(102, "Advance Java", 1450));
	book.add(new Book(103, "Spring Framework", 958));
	book.add(new Book(104, "Hibernate", 740));
	book.add(new Book(105, "Spring Boot", 620));
	book.add(new Book(106, "Microservices", 1136));
	return book;
	
	}
}
