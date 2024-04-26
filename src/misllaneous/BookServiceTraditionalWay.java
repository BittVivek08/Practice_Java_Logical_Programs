package misllaneous;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookServiceTraditionalWay {

	public List<Book> getBookInSort(){
		List<Book> books = new BookDao().getBooks();
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});
		return books;
	}
	
	public static void main(String [] args) {
		System.out.println(new BookServiceTraditionalWay().getBookInSort());
	}
}
	
/*
 * class MyComparator implements Comparator<Book> {
 * 
 * @Override public int compare(Book o1, Book o2) {
 * 
 * return o1.getName().compareTo(o2.getName()); }
 * 
 * 
 * }
 */
