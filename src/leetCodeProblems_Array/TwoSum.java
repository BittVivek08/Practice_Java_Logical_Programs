package leetCodeProblems_Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums1 = {3,8,4,9};
		int target = 17;
		
		int[] result = twoSum(nums1, target);
		System.out.println("Output: [" + result[0] + "," + result[1] + "]");

	}

	public static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> numToIndex = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			
			if(numToIndex.containsKey(complement)) {
				
				return new int[] {numToIndex.get(complement),i};
			}
			numToIndex.put(nums[i], i);
		}
		
		return new int[0];
	}
}
