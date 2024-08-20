package practiceForInterview_23_07_24;

public class ArrayCopyElement {

	public static void main(String[] args) {
		int[] originalArray = new int[] {1,2,3,4,5};
		System.out.println("Element of original Array :: ");
		for(int i = 0; i < originalArray.length; i++) {
			System.out.println(originalArray[i]);
		}
		
		int[] copiedArray = new int[originalArray.length];
		
		for(int i = 0; i < originalArray.length; i++) {
			copiedArray[i] = originalArray[i];
		}
		
		System.out.println("Elements of copied array :: ");
        for(int i = 0; i <copiedArray.length; i++) {
        	System.out.println(copiedArray[i]);
        }
	}

}
