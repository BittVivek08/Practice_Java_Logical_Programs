package practiceForInterview_23_07_24;

import java.util.ArrayList;

public class SortingOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(56);
		list.add(78);
		list.add(12);
		list.add(37);
		list.add(30);
		list.add(10);
		list.add(99);
		
		System.out.println("Element of list before sorting :: " + list);
		bubbleSort(list);
		
		System.out.println("=========================================");
		System.out.println("Element of list After Sorting :: " + list);
      
	}
	  public static void bubbleSort(ArrayList<Integer> list) {
		  int n = list.size();
		  boolean swapped;
		  
		  for(int i = 0; i < n - 1; i++) {
			  swapped = false;
			  
			  for(int j = 0; j < n - i - 1; j++) {
				  if(list.get(j) > list.get(j + 1)) {
					  int temp = list.get(j);
					  
					  list.set(j, list.get(j + 1));
					  list.set(j + 1, temp);
					  swapped = true;
				  }
			  }
			  if(!swapped) 
				  break;
		  }
	  }

}
