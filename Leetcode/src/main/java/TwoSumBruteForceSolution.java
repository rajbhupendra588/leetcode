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

public class TwoSumBruteForceSolution {
	public int[] sum(int[] arr, int target) {
		int[] result = new int[2];
		for (int i=0;i<arr.length;i++) {
			for (int j=1;j<arr.length;j++)
			{
				if (arr[i]+arr[j] == target)
				{
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}

	public static void main(String args[])
	{
		int[] result = new int[2];
		TwoSumBruteForceSolution twoSumBruteForceSolution = new TwoSumBruteForceSolution();
		int[] arr1 = new int[] {2,7,11,15};
		result = twoSumBruteForceSolution.sum(arr1,18);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]);
		}
	}

}

/*
Brute force:
O(n2) runtime, O(1) space – 
The brute force approach is simple. Loop through each element x and find if there is
another value that equals to target – x. As finding another value requires looping through
the rest of array, its runtime complexity is O(n2).

*/
