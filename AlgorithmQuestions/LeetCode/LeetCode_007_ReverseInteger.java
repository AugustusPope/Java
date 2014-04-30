package leetcode;

public class LeetCode_007_ReverseInteger {
	
	public static void IntegerOverflowCheck(long num){
		if(num>Integer.MAX_VALUE) throw new ArithmeticException("Integer Overflow: num is larger than Integer.MAX_VALUE");
		if(num<Integer.MIN_VALUE) throw new ArithmeticException("Integer Overflow: num is smaller than Integer.MIN_VALUE");
	}
	
	public static int ReverseInteger(int num){
		
	
		boolean notNegative = ( num>=0? true:false);
		long abs_value = Math.abs(num);
		
		long result = 0;
		
		while(abs_value > 0){
			result = result * 10 + (abs_value % 10);
			abs_value /= 10; 
		}
		
		if(!notNegative) result = 0- result;
		IntegerOverflowCheck(result);

		return (int)result;
		
	}
	
	public static void main(String[] args){

		System.out.println(ReverseInteger(-1000));
		System.out.println(ReverseInteger(-999999999+Integer.MIN_VALUE));
		
	}

}
