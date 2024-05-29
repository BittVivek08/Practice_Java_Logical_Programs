package practiceString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringInUpperAndLower {

	public static void main(String[] args) {
		
		List<String> color = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
				
		System.out.println("List of string :: " + color);
		
        System.out.println("===================================================");

		
		List<String> upperCase = color.stream().map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println("Converted given String in upperCase :: " + upperCase);
        
        System.out.println("===================================================");
        
        List<String> lowerCase = color.stream().map(String :: toLowerCase).collect(Collectors.toList());
        
        System.out.println("Converted Given Strin in the lowerCase :: " + lowerCase);
	}

}
