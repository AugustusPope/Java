package leetcode;

import java.util.HashMap;
import java.util.HashSet;


//Given an array of integers, find two numbers such that they add up to a specific target number.
//
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
//
//You may assume that each input would have exactly one solution.
//
//Input: numbers={2, 7, 11, 15}, target=9
//Output: index1=1, index2=2

public class LeetCode_001_TwoSum {
	
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index + 1;
				result[1] = i + 1;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}

		return result;
	}
	
	public static void main(String[] args){
		int[] numbers={2, 7, 11, 15};
		int[] result = twoSum(numbers,17);
		if(result!=null){
			for(int i=0;i<result.length;i++){
				System.out.print(result[i]+",");
			}
		}
		
	}
	
	
	
	
	

}
