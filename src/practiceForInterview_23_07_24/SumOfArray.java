package practiceForInterview_23_07_24;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = new int[] {56,6,7,8,9};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of all the element of array is :: " + sum);

	}

}
