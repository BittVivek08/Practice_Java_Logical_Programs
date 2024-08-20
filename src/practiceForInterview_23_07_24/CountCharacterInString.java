package practiceForInterview_23_07_24;

public class CountCharacterInString {

	public static void main(String[] args) {
		
		String str = "The best of both worlds";
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				count ++;
			}
		}
		
		System.out.println("The number of character in the given word is : " + count);

	}

}
