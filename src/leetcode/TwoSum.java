package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String []args) {
		int[] dataSet = new int[] {5,6,3,9,8,2,10};
		int target = 18;
		int[] result = twoSum(dataSet, target);
		System.out.println(result[0] + " and "+ result[1]);
	}
	public static int[] twoSum(int[] dataSet, int target) {
		Map<Integer, Integer>availableValues = new HashMap<>();
		for(int i=0; i<dataSet.length; i++) {
			int need = target-dataSet[i];
			if(availableValues.containsKey(need)) {
				return new int[] {i, availableValues.get(need)};
			}
			availableValues.put(dataSet[i], i);
		}
		return new int[] {-1,-1};
	}
}
