package leetcode;


//Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
//n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
//Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//
//Note: You may not slant the container.

public class LeetCode_011_ContainerWithMostWater {
	
	public static int[] ContainerWithMostWater(int[] nums){
		if(nums == null || nums.length<2) return null;
		
		int leftIndex = 0;
		int rightIndex = nums.length-1;
		int maxArea = 0;
		int finalLeft = leftIndex;
		int finalRight = rightIndex;

		while(leftIndex<rightIndex){
			int curArea =  (rightIndex - leftIndex) * Math.min(nums[leftIndex], nums[rightIndex]);
			if(maxArea < curArea) { maxArea = curArea;finalLeft = leftIndex;finalRight = rightIndex; }
			if(nums[leftIndex] < nums[rightIndex])leftIndex ++;
			else rightIndex -- ;
		}
		
		int[] result = new int[]{nums[finalLeft],nums[finalRight]};
		return result;
		
		
	}
	
	public static void main(String[] args){

		int[] result = ContainerWithMostWater(new int[]{2,3,6,4,5});
        System.out.println(result[0]+" : "+result[1]);

	}

}
