package leetcode;


//Determine whether an integer is a palindrome. Do this without extra space.

public class LeetCode_009_PalindromeNumber {
	
	public static boolean isPalindromeNumber(int num){
		
		 if (num < 0) return false;
	    
		while(num>=10){
			
			 int right_digit = num % 10;// get right digit
			 int multiplier = (int)Math.pow(10, (int)Math.log10(num) ) ;
			 int left_digit = num /  multiplier; // get left digit
		
			 num = num - left_digit * multiplier; // remove left digit first
			 num = num/10;// remove right digit
		  
//			 System.out.println(left_digit + "   ,   " + right_digit);
//			 System.out.println(num);
			 
			 if(left_digit != right_digit)return false;
	   }
		
	
		return true;
		
	}
	
	public static void main(String[] args){

		System.out.println( isPalindromeNumber(12321));
		System.out.println( isPalindromeNumber(1221));
		System.out.println( isPalindromeNumber(1241));
	}

}
