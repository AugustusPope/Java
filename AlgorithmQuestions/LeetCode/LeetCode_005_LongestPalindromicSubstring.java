package leetcode;

//
//Given a string S, find the longest palindromic substring in S.
//In computer science, the longest palindromic substring or longest symmetric factor problem 
//is the problem of finding a maximum-length contiguous substring of a given string that is also a palindrome. 
//For example, the longest palindromic substring of "bananas" is "anana". 
//The longest palindromic substring is not guaranteed to be unique;
//for example, in the string "abracadabra", there is no palindromic substring with length greater than three, 
//but there are two palindromic substrings with length three, namely, "aca" and "ada". 
//In some applications it may be necessary to return all maximal palindromic substrings 
//(that is, all substrings that are themselves palindromes and cannot be extended to larger palindromic substrings) 
//rather than returning only one substring or returning the maximum length of a palindromic substring.


public class LeetCode_005_LongestPalindromicSubstring {
	
	
	//O ( n^2 )
	public static String LongestPalindromicSubstring(String s){
		
		char[] sp_str = new char[2 * s.length() - 1];
		char sp_char = '*';
		
		for(int i = 0; i< sp_str.length;i++){
			
			if(i%2 ==0) sp_str[i] = s.charAt(i/2);
			else sp_str[i]= sp_char;
		}
		
		int cur_max_len = 0; // the length of Longest Palindromic Substring in sp_str
		int cur_max_index = 0;// the index of Longest Palindromic Substring in sp_str
		
		int[] lps_len =  new int[ 2 * s.length() - 1];
		for(int i = 0; i< lps_len.length;i++){
			
			lps_len[i] = 1;// default count is 1
			
			int left = i -1,right = i+1;
			while(left>=0 && right<lps_len.length){
				if(sp_str[left] == sp_str[right]){
					lps_len[i] += 2;
					left --; 
					right ++;
					
					if(lps_len[i]>cur_max_len){
						cur_max_len = lps_len[i];
						cur_max_index = i;
					}
				}
				else break;
			}
			//System.out.print(sp_str[i]);
		}
				
		StringBuilder sb = new StringBuilder();
		int start = cur_max_index - cur_max_len /2;
		int end = cur_max_index + cur_max_len /2;
		
		while(start <= end){
			if(sp_str[start]!=sp_char){// ignore the '*'
				sb.append(sp_str[start]);
			}
			start ++;
		}
		
		return sb.toString();
		
	}
	
	
	
	private static String expandAroundCenter(String s, int c1, int c2) {
		  int l = c1, r = c2;
		  int n = s.length();
		  while (l >= 0 && r <= n-1 && s.charAt(l) == s.charAt(r)) {
		    l--;
		    r++;
		  }
		  return s.substring(l+1, r);
		}
		 
	public static	String longestPalindromeSimple(String s) {
		  int n = s.length();
		  if (n == 0) return "";
		  String longest = s.substring(0, 0);  // a single char itself is a palindrome
		  for (int i = 0; i < n-1; i++) {
		    String p1 = expandAroundCenter(s, i, i);
		    if (p1.length() > longest.length())
		      longest = p1;
		 
		    String p2 = expandAroundCenter(s, i, i+1);
		    if (p2.length() > longest.length())
		      longest = p2;
		  }
		  return longest;
		}
	
	public static void main(String[] args){
		
		String str = LongestPalindromicSubstring("forgeeksskeegfor");
		String str2 = longestPalindromeSimple("forgeeksskeegfor");
		System.out.println(str );
		System.out.println(str2);
		
	}

}
