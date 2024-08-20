package practiceForInterview_23_07_24;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number for checking Palindrome :: ");
		int number = scn.nextInt();
		
		int originalNumber = number;
		int reversedNumber = 0;
		
		while(number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}
		if(originalNumber == reversedNumber) {
			System.out.println(originalNumber + " is a PALINDROME number");
		}else {
			System.out.println(originalNumber + " is NOT A PALINDROME number");
		}
		scn.close();

	}

}
