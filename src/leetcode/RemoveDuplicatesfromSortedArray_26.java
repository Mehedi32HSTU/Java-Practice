package leetcode;

public class RemoveDuplicatesfromSortedArray_26 {
	public static int removeDuplicates(int[] nums) {
		Integer length = nums.length;
		int left=0,right = 0;
		if(length.equals(0) || length.equals(1)) return length;
		for(right = 1; right < length; right++) {
			if(nums[left] != nums[right]) {
				left++;
				nums[left]=nums[right];
			}
		}
//		for(int i=0;i<=left;i++) System.out.println(nums[i]);
		return left+1;
	}

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		int ln = removeDuplicates(nums);
		for(int i=0;i<ln;i++) System.out.println(nums[i]);
//		System.out.println(removeDuplicates(nums));

	}

}
