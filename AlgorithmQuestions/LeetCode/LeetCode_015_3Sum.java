package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//Problem:
//
//Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//Note:
//Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
//The solution set must not contain duplicate triplets.

public class LeetCode_015_3Sum {

	public static ArrayList<int[]> threeSum(int[] nums) {
		if (nums == null || nums.length < 3)
			return null;

		ArrayList<int[]> returnVal = new ArrayList<int[]>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {

			if(i>0&&nums[i]>nums[i-1])
			{
				int start = i + 1;
				int end = nums.length - 1;
	
				while (start < end) {
					if (nums[i] + nums[start] + nums[end] == 0) {
						int[] arr = new int[] { nums[i], nums[start], nums[end] };
						returnVal.add(arr);
						start++;
						end--;
	
						// avoid duplicate solutions
						while (start < end && nums[end] == nums[end + 1])
							end--;
						while (start < end && nums[start] == nums[start - 1])
							start++;
					} else if (nums[i] + nums[start] + nums[end] > 0) {
						end--;
					} else {
						start++;
					}
	
				}
				
			}
		}

		return returnVal;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		ArrayList<int[]> lists = threeSum(nums);
		for (int[] list : lists) {
			for (int i = 0; i < list.length; i++) {
				System.out.print(list[i] + " ");

			}
			System.out.println();
		}
	}

}
