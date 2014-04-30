package leetcode;

//Given a roman numeral, convert it to an integer.
//
//Input is guaranteed to be within the range from 1 to 3999.

public class LeetCode_013_RomanToInteger {

	private static int charToNum(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

	public static int RomanToInteger(String str) {
		String symbol[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
				"IX", "V", "IV", "I" };
		int value[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		if (str == null || str.isEmpty())
			throw new IllegalArgumentException(
					"str could not be null or empty!");
        int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((i > 0)&& (charToNum(str.charAt(i)) > charToNum(str.charAt(i - 1))))
			{
				result += (charToNum(str.charAt(i)) - 2 * charToNum(str.charAt(i - 1)));
			}
			else
			{
				result += charToNum(str.charAt(i));
			}
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(RomanToInteger("MCMLXVII"));
	}

}
