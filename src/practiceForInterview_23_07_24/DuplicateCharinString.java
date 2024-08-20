package practiceForInterview_23_07_24;

public class DuplicateCharinString {

	public static void main(String[] args) {
		
		String str = "Great Responsibility";
		str = str.toLowerCase();
		
		int count;
		
		char string[] = str.toCharArray();
		
		System.out.println("Duplicate char in given string is :: ");
		
		for(int i = 0; i < string.length; i++) {
			count = 1;
			
			for(int j = i+1; j < string.length; j++) {
				if(string[i] == string[j] && string[i] != ' ') {
					count ++;
					string[j] = '0';
				}
			}
			if(count > 1 && string[i] != '0') {
				System.out.println(string[i]);
			}
		}

	}

}
