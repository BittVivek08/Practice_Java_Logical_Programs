package java8CodingInterview_23_07_24;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFreqInParaString {

	public static void main(String[] args) {
		String sentence  = "Java is a programming language. java is versatile";
		
		Map<String, Long> collect = Arrays.stream(sentence.split("\\s+")).collect(Collectors.groupingBy(String :: toLowerCase, Collectors.counting()));
		
       System.out.println(collect);
	}

}
