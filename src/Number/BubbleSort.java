package Number;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = {5,9,1,6};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < array.length - 1; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					
					array[i] = array[j];
					array[j] = temp;
				}
			}
		
		}
		System.out.println();
	}

}
