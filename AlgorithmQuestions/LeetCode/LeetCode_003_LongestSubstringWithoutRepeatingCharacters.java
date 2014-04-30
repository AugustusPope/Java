package leetcode;

import java.util.HashSet;


//Given a string, find the length of the longest substring without repeating characters. 
//For example, the longest substring without repeating letters for “abcabcbb” is “abc”, 
//which the length is 3. For “bbbbb” the longest substring is “b”, with the length of 1.

public class LeetCode_003_LongestSubstringWithoutRepeatingCharacters {
	
	public static int LongestSubstringWithoutRepeatingCharacters(String s){
		
		HashSet<Character> hash_set = new HashSet<Character>();
		
		for(int i = 0;i<s.length();i++){
			hash_set.add(s.charAt(i));
		}
		
		return hash_set.size();
	}
	
	public static void main(String[] args){
		
		System.out.println(LongestSubstringWithoutRepeatingCharacters("bbbb"));
	}

}
