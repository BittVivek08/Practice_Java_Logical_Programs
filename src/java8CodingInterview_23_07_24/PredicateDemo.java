package java8CodingInterview_23_07_24;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateDemo {

	public static void main(String[] args) {
      EmployeePredicate e1 = new EmployeePredicate("Vivek", "Hyd", "Java");
      EmployeePredicate e2 = new EmployeePredicate("Raju", "Chennai", "JavaScript");
      EmployeePredicate e3 = new EmployeePredicate("Nilu", "Pune", "Db");
      EmployeePredicate e4 = new EmployeePredicate("Shanu", "Hyd", "Java");
      EmployeePredicate e5 = new EmployeePredicate("Komal", "Bangalore", "Java");
      
      List<EmployeePredicate> asList = Arrays.asList(e1, e2, e3, e4, e5);
      
        
        Predicate<EmployeePredicate> p1 = (e) -> e.location.equals("Hyd");
        Predicate<EmployeePredicate> p2 = (e) -> e.dept.equals("Java");
        
        Predicate<EmployeePredicate> p = p1.and(p2);
        
        for(EmployeePredicate emp : asList) {
        	if(p.test(emp)) {
        		System.out.println(emp.name);
        	}
        }
	}

}
