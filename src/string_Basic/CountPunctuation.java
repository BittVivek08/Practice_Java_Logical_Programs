package string_Basic;

public class CountPunctuation {

	public static void main(String[] args) {

		int count = 0;
		
		String str = "Bittu Vivek";
		
		String str1 = str.toLowerCase();
		
		for(int i = 0; i < str1.length(); i++) {
			
			if(str1.charAt(i) == 'v') {
				count++;
			}
		}
		System.out.println("The number of i in the given name is " + count);
	}

}
