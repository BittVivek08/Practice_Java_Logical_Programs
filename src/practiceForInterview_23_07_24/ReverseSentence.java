package practiceForInterview_23_07_24;

public class ReverseSentence {

	public static void main(String[] args) {
     
		String sentence = "Java is my programming language";
		
		String reversed = reverseSen(sentence);
		System.out.println("Original Sentence :: " + sentence);
		System.out.println();
		System.out.println("Reversed Sentence :: " + reversed);
	}
	
	public static String reverseSen(String sentence) {
		String[] word = sentence.split(" ");
		StringBuilder reversed = new StringBuilder();
		for(int i = word.length - 1; i >= 0; --i) {
			reversed.append(word[i]);
			if(i != 0) {
				reversed.append(" ");
			}
		}
		return reversed.toString();
	}

}
