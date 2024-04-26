package Number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Bittu", 28);
		map.put("Anurag", 26);
		map.put("Vipul", 29);
		map.put("Guddu", 30);
		map.put("Deepak", 32);
		map.put("Rahul", 31);
		map.put("Kundan", 28);
		
	//	List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		
		//Traditional way of sorting
		
	//	Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
         
		/*	@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		
		for (Entry<String, Integer> entry : entries ) {
		    System.out.println(entry.getKey() + " " +entry.getValue());
		}*/
		
         // Sorting By lembda expression
	//	Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		
		
	//	for(Entry<String, Integer> entry : entries) {
	//		System.out.println(entry.getKey() + "  " + entry.getValue());
	//	}
		
		// Sorting By Stream method
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
