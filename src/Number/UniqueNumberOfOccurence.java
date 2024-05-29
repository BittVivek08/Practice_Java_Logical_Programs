package number;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueNumberOfOccurence {

	public static void main(String[] args) {
		
		int [] num = {1,2,2,1,1,3};
		
		System.out.println(hasUniqueOccurences(num));

	}
	
	public static boolean hasUniqueOccurences(int[] arr) {
		Map<Integer, Long> occurences = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		Set<Long> uniqueOccurences = occurences.values().stream().collect(Collectors.toSet());
		
		return occurences.size() == uniqueOccurences.size();
	}

}
