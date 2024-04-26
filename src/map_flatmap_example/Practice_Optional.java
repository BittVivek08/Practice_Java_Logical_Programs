package map_flatmap_example;

import java.util.Arrays;
import java.util.Optional;

public class Practice_Optional {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "Bittu", null, Arrays.asList("8956478912", "6598745689"));
		
		// Empty()
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		//of()
	//	Optional<Object> nullOptional = Optional.of(emp.getEmail());
	//	System.out.println(nullOptional);
		
        // ofNullable()
		Optional<Object> nullableOptional = Optional.ofNullable(emp.getEmail());
		System.out.println(nullableOptional);
	}

}
