package map_flatmap_example;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {

		List<Employee> employee = EmployeeDatabase.getAll();

		// List<Employee> convert List<String> is called DataTransformation
		// mapping(one to one) : employee -> employee.getEmail()
		List<String> email = employee.stream().map(emp -> emp.getEmail()).collect(Collectors.toList());

		    for(String s : email) {
			System.out.println(s);
		    }

		// employee -> employee.getPhoneNumber() one to many mapping
		List<List<String>> phoneNumber = employee.stream().map(emp -> emp.getPhoneNumber())
				.collect(Collectors.toList());

		System.out.println(phoneNumber);

		// List<Employee> convert List<String> is called DataTransformation
		// mapping(one to many) : employee -> employee.getPhoneNumber
		List<String> phnNumber = employee.stream().flatMap(emp -> emp.getPhoneNumber().stream())
				.collect(Collectors.toList());
		System.out.println(phnNumber);
		
		List<String> list = employee.stream().filter(e -> e.getId() >= 102).map(e -> e.getName()).collect(Collectors.toList());
		for(String s1 : list) {
			System.out.println(s1);
		}

	}

}
