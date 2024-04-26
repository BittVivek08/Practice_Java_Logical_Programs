package practiceString;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacterInString {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String in which you want "
				+ "to calculate the frequency of characters : ");
		String str = scn.nextLine();
		String trimedString = str.replaceAll("\\s", "");
		
		 Map<String, Long> map = Arrays.stream(trimedString.split(""))
		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
        System.out.println("Frequency Of characters of Your words are : " + map);
	}

}
