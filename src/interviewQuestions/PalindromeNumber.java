package interviewQuestions;

public class PalindromeNumber {

	
	/* 
	 * https://www.youtube.com/watch?v=XGs7rrv-baA&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=32
	 * Palindrome number in java: A palindrome number is a number that is same after reverse. 
	 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
	 * It can also be a string like LOL, MADAM etc. */
	
	public static void isPalindromeNumber(int num) {
		
		int remainder = 0;
		int sum = 0;
		int temp;
		
		temp = num;
		
		while (num>0) {
			remainder=num%10; // get the remainder, if num=141, remainder is 1
			sum = (sum*10) + remainder; //(0*10)+1
			num = num/10; // 141/10= 14 and then it will again check while num >0 --14
		}
		if (temp == sum) {
			System.out.println(temp+" is a PalindromeNumber");
		}
		else
		{
			System.out.println(temp+" isn't a PalindromeNumber");
		}
	}
	
	
	public static void main(String[] args) {
		isPalindromeNumber(48984);

	}

}
