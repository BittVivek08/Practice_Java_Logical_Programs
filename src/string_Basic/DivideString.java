package string_Basic;

public class DivideString {

	public static void main(String[] args) {
		
		String str = "aaaabbbbcccc";
		
		int len = str.length();
		
		int n = 3;
		
		int temp = 0;
		
		int chars = len/n;
		
		String[] equalStr = new String[n];
		
		if(len % n != 0) {
			System.out.println("Sorry this String can not divide into " + n + " equal parts");
		}else {
			for(int i = 0; i < len; i = i + chars) {
				String parts = str.substring(i, i+chars);
				equalStr[temp] = parts;
				temp++;
			}
			System.out.println(n + " Equal parts of given string are : ");
			for(int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}

	}

}
