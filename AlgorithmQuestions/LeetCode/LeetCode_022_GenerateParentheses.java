package leetcode;

import java.util.ArrayList;
import java.util.HashSet;


//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
//For example, given n = 3, a solution set is:
//
//"((()))", "(()())", "(())()", "()(())", "()()()"


public class LeetCode_022_GenerateParentheses {
	
	
	public static HashSet<String> GenerateParentheses(int n){
		if(n==0){HashSet<String> list = new HashSet<String>();list.add("");return  list;}
		HashSet<String> returnVal = new HashSet<String>();
		HashSet<String> list = GenerateParentheses(n-1);
		
		for(String str: list){
			returnVal.add("("+str+")");
			returnVal.add(str+"()");
			returnVal.add("()"+str);
		}
		
        return returnVal;
	}
	
	
	public static void GenerateParentheses(String str ,int leftRemain, int rightRemain){
		
		if(leftRemain == 0 && rightRemain == 0) System.out.println(str);

		if(leftRemain>0){
			GenerateParentheses(str+"(",leftRemain - 1, rightRemain);
		}		
		if(rightRemain>leftRemain){
			GenerateParentheses(str+")",leftRemain, rightRemain-1);
		}

	}
	
	public static void main(String[] args){
		HashSet<String>  list = GenerateParentheses(3);
		for(String str: list){
			System.out.println(str);
		}
		
		
		System.out.println("****************************************");
		
		GenerateParentheses("",3,3);
	}

}
