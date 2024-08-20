package practiceForInterview_23_07_24;

public class VowelCount {

	public static void main(String[] args) {
		
		String str1 = "This is a really simple sentence";
		
		String str  =str1.toLowerCase();
		
		int vCount = 0;
		
		int cCount = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				   
				vCount ++;
			
			}else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				
				cCount ++;
			}
			
		}
		
		System.out.println("Number of vowels in given string is : " + vCount);
		System.out.println("Number of Consonent in given string is : " + cCount);

	}

}
