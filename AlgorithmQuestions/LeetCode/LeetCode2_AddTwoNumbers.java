package LeetCode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

//You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8

public class LeetCode2_AddTwoNumbers {
	
	public static LinkedList<Integer> AddTwoNumbers(LinkedList<Integer> left, LinkedList<Integer> right){
		LinkedList<Integer> result = new LinkedList<Integer> ();
		
		Iterator<Integer> leftItor = left.iterator();
		Iterator<Integer> rightItor = right.iterator();
		
		boolean isCarry = false;
		Integer sum = null;
		
		// after this loop, at least one iterator will has no elements left
		while(leftItor.hasNext()&&rightItor.hasNext()){
		   Integer leftInt = leftItor.next();
		   Integer rightInt = rightItor.next();
		   
		   sum = leftInt + rightInt;
		   
		   if(isCarry == true){
			   sum+=1;
			   isCarry = false;
		   }
		   
		   if(sum>=10){
			   isCarry = true;
			   sum %= 10;
		   }
		   
		   
		   result.addLast(sum);
		   
		}
		
		// right iterator has elements
		if(leftItor.hasNext() == false && rightItor.hasNext()!=false){
			Integer rightInt = rightItor.next();
			sum = (isCarry == true? 1+rightInt : rightInt);
			
			if(sum>=10){
				sum %= 10;
				isCarry = true;
			}
			
			
			result.addLast(sum);
		}
		
		// left iterator has elements
		if(leftItor.hasNext() == true && rightItor.hasNext()==false){
			Integer leftInt = leftItor.next();
			sum = (isCarry == true? 1+leftInt : leftInt);
			
			if(sum>=10){
				sum %= 10;
				isCarry = true;
			}
			
			result.addLast(sum);
		}
			
		
		if(isCarry == true) result.addLast(1);
		
		
		return result;
		
	}
	
	
	
	public static void main(String[] args){
		
		LinkedList<Integer>  left = new LinkedList(Arrays.asList(5,6,7));
		LinkedList<Integer>  right = new LinkedList(Arrays.asList(5,6,7));
		LinkedList<Integer> sum  = AddTwoNumbers(left,right);
		
		System.out.println(sum.toString());
	}
	

}
