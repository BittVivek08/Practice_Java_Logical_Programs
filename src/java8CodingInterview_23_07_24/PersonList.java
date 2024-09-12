package java8CodingInterview_23_07_24;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonList {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(
				    new Person(23, "Kunal"),
				    new Person(29, "Vivek"),
				    new Person(30, "Vipul"),
				    new Person(36, "Saurabh"),
			    	new Person(19, "Anshu"));
		
		List<Person> collect = person.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());
		System.out.println(collect);
		
		Collections.sort(person, Comparator.comparing(Person :: getAge));
		System.out.println(person);
		
		// Another way of doing it this time sort based on person name
		System.out.println("Another way of doing it this time sort based on person name ::: ");
		person.stream().sorted(Comparator.comparing(Person :: getName)).forEach(System.out::println);
        
	}

}
