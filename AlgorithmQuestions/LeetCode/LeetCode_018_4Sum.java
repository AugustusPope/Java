package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
//
//Note:
//Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
//The solution set must not contain duplicate quadruplets.

public class LeetCode_018_4Sum {
	
	
//	public static HashSet<ArrayList<Integer>> nSum(int[] nums,int n) {
//		if(nums == null|| nums.length<n)return null;
//		Arrays.sort(nums);
//		HashSet<ArrayList<Integer>> returnVal = new HashSet<ArrayList<Integer>>();
//		for (int i = 0; i < nums.length - n+1; i++) {
//			int cursor = i+1;
//			
//			
//			ArrayList<Integer> val = new ArrayList<Integer>();
//			int sum = 0;
//			int j = 0;
//			while(j<n){
//				sum += (nums[i+j]);
//				val.add(nums[i+j]);
//				j++;
//				
//			}
//			if(sum == 0){
//				returnVal.add(val);
//			}
//			
//		
//		}
//
//		return returnVal;
//	}

	
	
	public static HashSet<int[]> fourSum(int[] nums) {
		if(nums == null|| nums.length<4)return null;
		Arrays.sort(nums);
		HashSet<int[]> returnVal = new HashSet<int[]>();
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				for (int k = j + 1; k < nums.length - 1; k++) {
					for (int l = k + 1; l < nums.length; l++) {
						if (nums[i] + nums[j] + nums[k] + nums[l] == 0) {
							returnVal.add(new int[] { nums[i], nums[j],
									nums[k], nums[l] });
						}
					}

				}
			}

		}

		return returnVal;
	}

	public static void main(String[] args) {
		// ArrayList<int[]> re = fourSum(new int[]
		// {-1,2,-1,3,-1,3,-1,4,0,-4,-2,0});
		HashSet<int[]> re = fourSum(new int[] { 1, 0, -1, 0, -2, 2 });
		for (int[] al : re) {
			for (int i = 0; i < al.length; i++) {
				System.out.print(al[i] + " , ");
			}
			System.out.println();
		}
		
		System.out.println("*****************************************************");
//		HashSet<ArrayList<Integer>>  re2= nSum(new int[] { 1, 0, -1, 0, -2, 2 },4);
//		for(ArrayList<Integer> list: re2){
//			for(Integer var: list){
//				System.out.print(var + " , ");
//			}
//			System.out.println();
//		}
	}

}
