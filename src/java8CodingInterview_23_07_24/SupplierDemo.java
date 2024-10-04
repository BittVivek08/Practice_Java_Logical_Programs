package java8CodingInterview_23_07_24;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<String> s = () -> {
			String otp = "";
			for(int i = 1; i <= 6; i++) {
				otp = otp + (int)(Math.random() * 10);	
			}
			return otp;
		};
		System.out.println("Generated OTP is :: " + s.get());
		System.out.println("Generated OTP is :: " + s.get());
		System.out.println("Generated OTP is :: " + s.get());
		System.out.println("Generated OTP is :: " + s.get());
	

	}

}
