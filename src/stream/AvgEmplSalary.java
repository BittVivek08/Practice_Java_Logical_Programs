package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AvgEmplSalary {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sameer", 26500.00, "USA");
		Employee e2 = new Employee(2, "Komal", 86000.00, "INDIA");
		Employee e3 = new Employee(3, "Sudhakar", 34840.00, "INDIA");
		Employee e4 = new Employee(4, "Hari", 78256.00, "USA");
		Employee e5 = new Employee(5, "Lala", 96658.125, "CHINA");

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);

		Optional<Employee> maxSalary = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Maximum Salary :: " + maxSalary.get().name + " - " + maxSalary.get().salary);

		Optional<Employee> minSalary = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Minimum Salary :: " + minSalary.get().name + " - " + minSalary.get().salary);

		Double avgSalary = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("Average Salary :: " + avgSalary);

		Map<String, List<String>> groupBy = list.stream()
				                                                        .collect(Collectors.groupingBy(e -> e.countary, Collectors
				                                                        .mapping(u -> u.name, Collectors.toList())));
		           System.out.println(groupBy);

	}
}

class Employee {

	int id;
	String name;
	double salary;
	String countary;

	public Employee(int id, String name, double salary, String countary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.countary = countary;
	}

}
