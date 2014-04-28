package dynamicprogramming;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.ArrayList;






public class DynamicProgramming_LongestIncreasingSubsequence {
	
	
	public static  int LongestIncreasingSubsequence(int[] seq){
		
		if(seq==null)throw new NullPointerException("seq could not be null!");
		if(seq.length==0) throw new InvalidParameterException("seq's length could not be smaller or equal to 0!");
		else{
			
			int[] maxEndArray = new int[seq.length];
			int[] maxLenArray = new int[seq.length];
			
			maxEndArray[0] = seq[0];
			maxLenArray[0] = 1;			
		
			
			for(int i=1;i<seq.length;i++){
				for(int j = 0;j<i;j++){
					if(seq[i]>maxEndArray[j]){
						maxEndArray[i] = seq[i];
						maxLenArray[i] = maxLenArray[j]+1;
					}
					else{
						maxEndArray[i] = maxEndArray[j];
						maxLenArray[i] = maxLenArray[j];
					}
				}
				
			}
			
			
			return maxLenArray[seq.length-1];
		}
		
	}
	
	
	public static void main(String[] args){
		
		int[] arr= new int[]{ 10, 22, 9, 33, 21, 50, 41, 60, 80};
		int[] arr2 = new int[]{0,8,4,12,2,10,6,14,1,9,5,13,3,11,15,7};
		int[]arr3 = new int[]{2, 4, 3, 5, 1, 7, 6, 9, 8};
		System.out.println(LongestIncreasingSubsequence(arr));
		System.out.println(LongestIncreasingSubsequence(arr2));
		System.out.println(LongestIncreasingSubsequence(arr3));
	}

}
