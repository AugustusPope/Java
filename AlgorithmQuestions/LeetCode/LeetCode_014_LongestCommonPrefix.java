package leetcode;

import java.util.ArrayList;


//Write a function to find the longest common prefix string amongst an array of strings.

public class LeetCode_014_LongestCommonPrefix {
	
	public static String LongestCommonPrefix(String[] strArr){
		if(strArr == null || strArr.length<1) return null;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<strArr[0].length();i++){
			char cur_char= strArr[0].charAt(i);
			for(int j = 1;j<strArr.length;j++){

				if(i>=strArr[j].length() ||  strArr[j].charAt(i)!=cur_char) return sb.toString();

			}
			sb.append(cur_char);//all strings have this char, then put it to stringBuilder
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		String[] strs = new String[]{"abc","abcf","abe"};
		System.out.println(LongestCommonPrefix(new String[]{"abcd","ab","abe"}));
	}

}
