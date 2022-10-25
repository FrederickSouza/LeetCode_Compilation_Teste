package respostas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Difficult: easy
 * 
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class TwoSum {
	
	public static void solution() {
		System.out.println("TwoSum - solution");
		int[] nums = {1,2,7,11,15};
		int target = 17;
		
		//int[] resp = sumForce(nums, target);
		int[] resp = sumHashMap(nums, target);
		
		System.out.println("Resp: " + Arrays.toString(resp));
	}
	
	//sum using two loops that iterate through the sequence
	//checking if the sum of nums[i] + nums[j] = target
	public static int[] sumForce(int[] nums, int target) {
		for (int i = 0; i < nums.length-1; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target)
					return new int[] {i,j};
			}
		}
		return new int[] {0, 0};
	}
	
	//check if the target - nums[i] = any previous number
	public static int[] sumHashMap(int[] nums, int target) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; hm.put(nums[i], i++))
			if (hm.containsKey(target - nums[i])) 
				return new int[] { hm.get(target - nums[i]),i};
		
		return new int[] {0,0};	
	}
	
	
}
