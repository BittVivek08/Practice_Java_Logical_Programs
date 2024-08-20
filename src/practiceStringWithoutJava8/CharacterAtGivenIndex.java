package practiceStringWithoutJava8;

public class CharacterAtGivenIndex {

	public static void main(String[] args) {

		String str = "Java is Awesome";
		
		System.out.println("Original String :: " + str);
		
		int index1 = str.charAt(6);
		int index2 = str.charAt(0);
		
		System.out.println("The character at Index 6 is :: " + (char)index1);
		
		System.out.println("The character at Index 0 is :: " + (char)index2);
	}

}
