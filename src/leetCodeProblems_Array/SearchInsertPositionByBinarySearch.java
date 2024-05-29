package leetCodeProblems_Array;

public class SearchInsertPositionByBinarySearch {
	
	public  int searchPosition(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] < target) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		
		return left;
	}

	public static void main(String[] args) {
		
		int [] nums = {1,2,3,4,5};
		int target1 = 5;
		
		SearchInsertPositionByBinarySearch i = new SearchInsertPositionByBinarySearch();
		int searchPosition = i.searchPosition(nums, target1);
		
		System.out.println("Index of target " + target1 + " is : " + searchPosition);
		
	}

}
