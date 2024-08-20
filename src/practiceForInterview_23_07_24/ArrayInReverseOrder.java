package practiceForInterview_23_07_24;

public class ArrayInReverseOrder {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println("Element of Original Array :: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Element Of Reversed Array :: ");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
