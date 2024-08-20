package practiceForInterview_23_07_24;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to check prime number :: ");
		int number = scn.nextInt();
		boolean isPrime = true;
		
		if(number < 2 ) {
			isPrime = false;
		}else {
			for(int i = 2; i <= number / 2; i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(number + " IS A PRIME NUMBER");
		}else {
			System.out.println(number + " IS NOT A PRIME NUMBER");
		}
        scn.close();
	}

}
