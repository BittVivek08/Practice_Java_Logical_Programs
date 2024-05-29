package leetCodeProblems_Array;

public class SearchInsertPositionByLinearSearch {

	public static int searchInsert(int[] nums, int target) {
		try {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] >= target) {
					return i;
				}
			}

			return -1;
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException("Array Index is out of bound : " + e.getMessage());
		}
	}

	public static void main(String[] args) {

		int[] nums = { 1, 5, 6, 9 };
		int target1 = 98;
		System.out.println("Index of target element " + target1 + " is : " + searchInsert(nums, target1));

	}

}
