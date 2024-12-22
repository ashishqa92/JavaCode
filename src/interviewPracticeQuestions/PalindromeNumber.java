package interviewPracticeQuestions;

public class PalindromeNumber {

	/*
	 * Palindrome number in java: A palindrome number is a number that is same after
	 * reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome
	 * numbers. It can also be a string like LOL, MADAM etc.
	 */

	public static void isPalindromeNumber(int num) {
		int remainder = 0;
		int reversedNumber = 0;
		int originalNumber;

		originalNumber = num;

		while (num > 0) {
			remainder = num % 10; // Extract the last digit
			reversedNumber = (reversedNumber * 10) + remainder; // Build the reversed number
			num = num / 10; // Remove the last digit
		}
		if (originalNumber == reversedNumber) {
			System.out.println(originalNumber + " is a Palindrome Number");
		} else {
			System.out.println(originalNumber + " isn't a Palindrome Number");
		}
	}

	public static void main(String[] args) {
		isPalindromeNumber(525);
	}
}
