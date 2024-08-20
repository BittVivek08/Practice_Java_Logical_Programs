package practiceForInterview_23_07_24;

public class SortingOfArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
		
		System.out.println("Arrays after sorting");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
