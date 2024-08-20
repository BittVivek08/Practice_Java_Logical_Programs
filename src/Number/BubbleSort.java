package number;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = {15,9,11,26};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		
		}
		System.out.println("The Sorted Array :: ");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
	}

}
