package leetcode;


//There are two sorted arrays A and B of size m and n respectively.
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).


public class LeetCode_4_MedianOfTwoSortedArrays {
	
	public static double MedianOfTwoSortedArrays(int[] left_arr, int[] right_arr){
		int leftEnd = left_arr.length -1 ;
		int rightEnd  = right_arr.length - 1;
		int leftBeg = 0;
		int rightBeg = 0;
		
		int leftIndex = (leftBeg + leftEnd) /2;
		int rightIndex = (rightBeg+rightEnd)/2;
		
		while(leftBeg<leftEnd||rightBeg<rightEnd){
			
			if(left_arr[leftIndex]<right_arr[rightIndex]){
				
				leftBeg = leftIndex+1;
				leftIndex = (leftBeg + leftEnd)/2;
				
				rightEnd = rightIndex;
				rightIndex = (rightBeg+rightEnd)/2;
				
			}
			else
			{
				leftEnd = leftIndex;
				leftIndex = (leftBeg+ leftIndex)/2;
				
				rightBeg = rightIndex +1;
				rightIndex = (rightIndex + rightEnd)/2;
				
			}
		}
		
		
		if((left_arr.length+right_arr.length)%2 == 0){
			
			//System.out.println("<"+left_arr[leftIndex] +" , "+right_arr[rightIndex]+">");
			return (double)(left_arr[leftIndex] + right_arr[rightIndex]) /2 ;// handle division 
			
		}
		else{
			
			return Math.min(left_arr[leftIndex], right_arr[rightIndex]);
		}
		
	}
	
	
	public static void main(String[] args){
		
		int[] left = { 1, 2, 4, 8, 9, 10 };
		int[] right = { 3, 5, 6, 7 };
		double result = MedianOfTwoSortedArrays(left,right);
		System.out.println(result);
		
	}
	
	

}
