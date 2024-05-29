package string_Basic;

public class CountVowelAndConst {

	public static void main(String[] args) {

		int vCount = 0;
		int cCount = 0;
		
		String str = "Bittu Vivek";
		
		String str1 = str.toLowerCase();
		
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' 
					|| str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
				vCount++;
			}else if(str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
				
				cCount++;
			}
		}
		System.out.println("The number of vowel in the given string is " + vCount);
		System.out.println();
		System.out.println("The number of consonent in the given string is " + cCount);
	}

}
