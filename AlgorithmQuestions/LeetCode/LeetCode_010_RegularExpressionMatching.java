package leetcode;
//package leetcode;
//
//import java.util.Iterator;
//
//
////Implement regular expression matching with support for ‘.’ and ‘*’.
////
////‘.’ Matches any single character.
////‘*’ Matches zero or more of the preceding element.
////The matching should cover the entire input string (not partial).
////
////The function prototype should be:
////bool isMatch(const char *s, const char *p)
////
////Some examples:
////isMatch(“aa”,”a”) → false
////isMatch(“aa”,”aa”) → true
////isMatch(“aaa”,”aa”) → false
////isMatch(“aa”, “a*”) → true
////isMatch(“aa”, “.*”) → true
////isMatch(“ab”, “.*”) → true
////isMatch(“aab”, “c*a*b”) → true
//
//public class LeetCode_10_RegularExpressionMatching {
//	
//	
//	public static boolean isRegularExpressionMatch(String str, String re){
//		if(str==null||str.isEmpty()||re==null||re.isEmpty())throw new IllegalArgumentException("String parameter could not be null or empty!");
//		int strIndex = 0;
//		int reIndex = 0;
//		
//		char pre_re = ' ';
//		char cur_re = re.charAt(reIndex);
//		
//		while(strIndex<str.length() && reIndex<re.length()){
//			
//			if(str.charAt(strIndex) == cur_re) {
//				strIndex ++;
//				continue;
//			}
//			else if (cur_re=='.'){
//				strIndex ++;
//				pre_re = '.';
//				continue;
//			}
//			else if(cur_re=='*'){
//				if(str.charAt(strIndex)  == pre_re){
//					strIndex ++;
//					continue;
//				}
//			}
//			else{
//				pre_re = cur_re;
//				cur_re = re.charAt(++reIndex);
//			}
//		}
//		
//		if(reIndex>=re.length()) return false;
//		
//		if(strIndex>=str.length()) return true;
//		
//	}
//	
//	
//	public static void main(String[] args){
//		
//		
//	}
//
//}
