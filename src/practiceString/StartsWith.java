package practiceString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Mobile");
		list.add("Phone");
		list.add("Dhoni");
		list.add("Don");
		list.add("Cat");
		list.add("Dog");
		list.add("Camel");
		
	//	List<String> toLower = list.stream().map(String :: toLowerCase).collect(Collectors.toList());
		
		
		
		
         for(String s : list) {
        	 System.out.println(s);
         }
         System.out.println("=========");
         
         list.stream().filter(p -> p.startsWith("D"))
        		 .forEach(p -> System.out.println(p));
         
	}

}
