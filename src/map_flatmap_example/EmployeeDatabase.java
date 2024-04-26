package map_flatmap_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
	
	public static List<Employee> getAll(){
		
		return Stream.of(
				new Employee(101, "Bittu", "bittu@gmail.com", Arrays.asList("8956478912", "6598745689")),
				new Employee(102, "Vipul", "vipul@gmail.com", Arrays.asList("6956478912", "7598745689")),
				new Employee(103, "Vivek", "vivek@gmail.com", Arrays.asList("1956478912", "1598745689")),
				new Employee(104, "Guddu", "guddu@gmail.com", Arrays.asList("2256478912", "2298745689")),
				new Employee(105, "Deepak", "deepak@gmail.com", Arrays.asList("3356478912", "3398745689")),
				new Employee(106, "Raju", "raju@gmail.com", Arrays.asList("4456478912", "4498745689"))
				).collect(Collectors.toList());
	}

}
