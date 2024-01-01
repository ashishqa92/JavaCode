package practiceQuestions;

public class PrimeNumber {
	
	
	/*
	 * https://www.youtube.com/watch?v=UijOILYyNew&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=31
	 * Prime number in Java: Prime number is a number that is greater than 1 and
	 * divided by 1 or itself only. In other words, prime numbers can't be divided
	 * by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are
	 * the prime numbers.
	 * Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.
	 */	

	public static boolean isPrimeNumber(int num) {
		
		if (num<=1) {
			return false;
		}
		
		for (int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	//If we have to find the prime numbers till 20 or 50 then we can use the below method
	
	/*
	 * public static void printPrimeNumber(int num) { for (int i=2; i<=num; i++) {
	 * if (isPrimeNumber(i)) System.out.print(i + " ");
	 * 
	 * } }
	 */
	
	public static void main(String[] args) {
		System.out.println("2 is a prime number: " + isPrimeNumber(2)); // we are calling the static method isPrimeNumber
		System.out.println("5 is a prime number: " + isPrimeNumber(5));
		System.out.println("9 is a prime number: " + isPrimeNumber(9));
		
		/* printPrimeNumber(20); */

	}

}
