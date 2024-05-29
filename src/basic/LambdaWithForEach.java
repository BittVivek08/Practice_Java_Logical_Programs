package basic;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithForEach {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Bittu");
		list.add("Vivek");
		list.add("Ram");
		list.add("Navin");
		
		list.forEach((n) -> System.out.println(n));
	}
	
	

}
