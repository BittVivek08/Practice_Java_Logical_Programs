package practiceString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharInString {

	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter Your Word : ");
			String str = scn.nextLine();
			String word = str.toLowerCase();

			List<String> result = Arrays.stream(word.split(""))
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
					.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

			System.out.println("Duplicate Characters In Your Word Are : " + result);
		}

	}

}
