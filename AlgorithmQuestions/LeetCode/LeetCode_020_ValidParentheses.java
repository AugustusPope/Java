package leetcode;

import java.util.Stack;


//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.


public class LeetCode_020_ValidParentheses {
	
	private static Character getLeftParenthese(Character c){
		switch(c){
		case ')': return '(';
		case ']': return '[';
		case '}': return '{';
		default: return null;
		
		}
	}
	
	public static boolean ValidParentheses(final String str){
		Stack<Character> leftParens = new Stack<Character> ();
		//Stack<Character> rightParens = new Stack<Character> ();
		for(int i=0;i<str.length();i++){
			Character c = str.charAt(i);
			if(c=='('||c==  '['||c=='{'){
				leftParens.push(c);
			}
			else if (c==')'||c==  ']'||c=='}'){
				if(leftParens.isEmpty()) return false;
				if(leftParens.peek()!=getLeftParenthese(c))return false;
				else leftParens.pop();
			}
			else throw new IllegalArgumentException("Invalid character inspected in str !");
		}
		
		if(leftParens.isEmpty()) return true;
		else return false;
	}
	
	public static void main(String[] args){
		System.out.println(ValidParentheses("(){{}[]"));
		System.out.println(ValidParentheses("](){{}[]"));
		System.out.println(ValidParentheses("(){}[]"));
		System.out.println(ValidParentheses("()((())"));
		System.out.println(ValidParentheses("()((())))"));
	}

}
