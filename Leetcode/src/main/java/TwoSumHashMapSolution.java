/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 103
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMapSolution {
	public int[] sum(int[] arr, int target) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i=0;i<arr.length;i++)
		{
			if (map.containsKey(target - arr[i]))
				return new int[]{map.get(target - arr[i]),i};
			else
				map.put(arr[i], i);
		}
		return new int[]{-1, -1};
	}

	public static void main(String args[])
	{
		TwoSumHashMapSolution twoSumHashMapSolution = new TwoSumHashMapSolution();
		int[] result;
		int[] arr1 = new int[] {2,7,11,15};
		result = twoSumHashMapSolution.sum(arr1,26);
		System.out.println(Arrays.toString(result));
	}
}
