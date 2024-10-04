package ashokSirJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpData {

	public static void main(String[] args) {
	
     List<Employee> emps = new ArrayList<Employee>();
     
     emps.add(new Employee(1, "Jhanshi", 32, "Female", "HR", 2011, 25000.0));
     emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
     emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
     emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
     emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
     emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
     emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
     emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
     emps.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
     emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.0));
     emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
     emps.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
     emps.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
     emps.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.0));
     emps.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
     emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
     
     // Filter Based On Age
     List<String> name = emps.stream().filter(e -> e.getAge() > 30).map(e -> e.getName()).collect(Collectors.toList());
		System.out.println("List Of employee whose age is greater than 30 :: " + name);
		
		// Question (01) How many Male and Female are there in the list
		System.out.println("===============Output of Question (01)==============:");
		Map<String, Long> gender = emps.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
		System.out.println("Number of male and female employee :: " +gender);
		
		//Question (2) print the name of all department in the organization
		System.out.println("================Output of Question (02)===============");
		emps.stream().map(e -> e.getDepartment()).distinct().forEach(dname -> System.out.println(dname));
		
		//Question(3) Average age of male and female employee
		System.out.println("=================Output of Question (03) ==============");
		Map<String, Double> avgAge = emps.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.averagingInt(Employee :: getAge)));
        System.out.println("Average age of male and female Employee :: " + avgAge);
        
		System.out.println("=================Output of Question (04) ==============");
        // Highest paid employee in the organization
		Optional<Employee> maxSalary = emps.stream().collect(Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary())));
		if(maxSalary.isPresent()) {
			Employee employee = maxSalary.get();
			System.out.println(employee);
		}
		
		System.out.println("=================Output of Question (05) ==============");
		//Name the employee who joined after 2015
		 emps.stream().filter(e -> e.getYearOfJoining() > 2015).map(e -> e.getName()).forEach(ename -> System.out.println(ename));
		
		 System.out.println("=================Output of Question (06) ==============");
		 // Count the number of employee in each department
		 Map<String, Long> countEmpByDept = emps.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting()));
	     System.out.println("Number of employee in each department is :: " + countEmpByDept);
	     
	     System.out.println("=================Output of Question (07) ==============");
	     // Average salary of employee department wise
	     Map<String, Double> avgSalDep = emps.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.averagingDouble(e -> e.getSalary())));
	     System.out.println("Department by salary :: " + avgSalDep);
	     
	     System.out.println("=================Output of Question (08) ==============");
	     // Get the details of youngest male employee in development department
	     Optional<Employee> youngEmp = emps.stream()
	              .filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
	              .min(Comparator.comparing(Employee :: getAge));
	     if(youngEmp.isPresent()) {
	    	 Employee youngestEmp = youngEmp.get();
	    	 System.out.println(youngestEmp);
	     }
	     System.out.println("=================Output of Question (09) ==============");
	     // who has the most experience in the organization
	     Optional<Employee> mostExpEmp = emps.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee :: getYearOfJoining)));
	     if(mostExpEmp.isPresent()) {
	    	 Employee e = mostExpEmp.get();
	    	 System.out.println("Most Experienced employee is :: " + e);
	     }
	     
	     System.out.println("=================Output of Question (10) ==============");
	     // How many male and female employee in sales team
	     Map<String, Long> count = emps.stream()
	    		                                               .filter(e -> e.getDepartment()
	    		                                               .equals("Sales")).collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
	     System.out.println("Number of male and female employee in sales department are :: " + count);
	     
	     System.out.println("=================Output of Question (11) ==============");
	     // What is the average salary of male and female employee
	     Map<String, Double> avgSalByGen = emps.stream()
	    		                                                              .collect(Collectors.groupingBy(Employee :: getGender, 
	    		                                                              Collectors.averagingDouble(Employee :: getSalary)));
	     System.out.println("Average salary of each gender is :: " + avgSalByGen);
	     
	     System.out.println("=================Output of Question (12) ==============");
	     // Get the employee who have second highest salary
	     // Approach - 01 :- sort employee salary in descending order then skip first
	     
	     Optional<Employee> findFirst = emps.stream()
	    		                                                      .sorted(Comparator.comparing(Employee :: getSalary)
	    		                                                      .reversed()).skip(1).findFirst();
	     System.out.println("Employee who have second highest second salary :: " + findFirst.get());
	     
	     // 	Approach - 02 
	     List<Employee> secHighSal = emps.stream()
	                                                       .sorted(Comparator.comparing(Employee :: getSalary).reversed())
	                                                       .collect(Collectors.toList());
	     System.out.println("By Approach - 02 :: " + secHighSal.get(1));
	}

}
