package practiceForInterview_23_07_24;

public class RemoveDuplicateFromArray {
	
	public static int removeDuplicate(int arr[], int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		int [] temp = new int[n];
		int j = 0;
		
		for(int i = 0; i < n-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		for(int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
      
	public static void main(String[] args) {
		int arr[]  = {10,20,20,30,30,40,50,50};
		
		int len = arr.length;
		
		len = removeDuplicate(arr, len);
		
		System.out.println("After removing of duplicate element :: ");
		
		for(int i = 0; i < len; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
