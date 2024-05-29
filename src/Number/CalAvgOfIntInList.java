package number;

import java.util.Arrays;
import java.util.List;

public class CalAvgOfIntInList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,6,8,10,18,36);
		
		System.out.println("List of Numbers : " + list);
		
		System.out.println("====================================");
		
		double average = list.stream().mapToDouble(Integer :: doubleValue).average().orElse(0.0);
        System.out.println("Average of given numbers is : " + average);
	}

}
