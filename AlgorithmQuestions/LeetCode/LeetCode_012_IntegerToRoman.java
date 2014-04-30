package leetcode;

import java.util.HashMap;


//Roman Numerals, as used today, are based on seven symbols:[1]
//Symbol	Value
//I	1
//V	5
//X	10
//L	50
//C	100
//D	500
//M	1,000



//Given an integer, convert it to a roman numeral.
//
//Input is guaranteed to be within the range from 1 to 3999.

public class LeetCode_012_IntegerToRoman {
	
	public static String IntegerToRoman(int num){
		
	    if(num<0||num>3999)throw new IllegalArgumentException("num could not be <0 or >3999!");
		
		String symbol[]={"M", "CM", "D", "CD","C","XC","L","XL","X","IX","V","IV","I"};    
        int value[]=    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5,  4,    1}; 
		int i = 0;
		StringBuilder sb= new StringBuilder();
		while(num>0){

			while(num>=value[i]){
				sb.append(symbol[i]);
				num -= value[i];
			}
		    ++i;
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args){
		System.out.println(IntegerToRoman(2979));
	}

}
