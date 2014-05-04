package leetcode;

import java.util.ArrayList;

//
//Given a digit string, return all possible letter combinations that the number could represent.
//
//
//

public class LeetCode_017_LetterCombinationsOfPhoneNumber {

	public static final String[] phoneDigitMapper = new String[] { "", "","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static ArrayList<String> LetterCombinationsOfPhoneNumber(String num) {
		if (num == null || num.isEmpty())
			throw new IllegalArgumentException(
					"num could not be null or empty!");

		ArrayList<String> result= new ArrayList<String>();
		for (int i = 0; i < num.length(); i++) {
			ArrayList<String> newResult = new ArrayList<String>();
			int digit = num.charAt(i) - '0';
			if (digit < 0 || digit > 9)
				throw new IllegalArgumentException(
						"Invalid telephone number, illegal char detected!");

			String str = phoneDigitMapper[digit];
			
			if(str.isEmpty())continue;// 0 and 1 have no corresponding digits

			if (result.isEmpty()) {
				for (int j = 0; j < str.length(); j++) {
				
					result.add("" + str.charAt(j));
				}
				continue;
			} 
			else {

				for (String al : result) {
					
					for (int j = 0; j < str.length(); j++) {
					
					    String tmp_str = al + str.charAt(j);
					    newResult.add(tmp_str);
					}
				
				}			
			}
			
			result.clear();
			result.addAll(newResult);
		}
		
	    return result;

	}

	public static void main(String[] args) { 
		ArrayList<String> al = LetterCombinationsOfPhoneNumber("9173760958");
		for(String str : al){
			System.out.println(str);
		}
	}

}
