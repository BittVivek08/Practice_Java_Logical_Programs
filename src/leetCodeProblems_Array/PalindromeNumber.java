package leetCodeProblems_Array;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int x) {
		if(x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		
		int revertedNumber = 0;
		int originalNumber = x;
		
		while(x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}
		return x == revertedNumber || x == revertedNumber / 10;
	}

	public static void main(String[] args) {
		
		int x = 121;
		boolean result = isPalindrome(x);
		System.out.println("Input : x = " + x);
		System.out.println("Output : " + result);
		System.out.println("Explanation : " + x + " reads as " + x + " from left to right and from right to left.");
		

	}

}
