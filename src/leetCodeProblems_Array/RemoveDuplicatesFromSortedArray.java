package leetCodeProblems_Array;

public class RemoveDuplicatesFromSortedArray {
	
	public static int removeDuplicateFromSortedArray(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int uniqueIndex = 1;
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[i - 1]) {
				nums[uniqueIndex] = nums[i];
				uniqueIndex++;
			}
		}
		return uniqueIndex;
	}

	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4,5,5};
		int k = removeDuplicateFromSortedArray(nums);
		
		System.out.println("Output : " + k + ", nums = [ " + nums[0] + "," + nums[1] + 
				(k > 2 ? "," + nums[2] : "") + "]");

	}

}
