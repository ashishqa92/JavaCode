package interviewQuestions;

public class CheckPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "radar";
		boolean isPalindrome = isPalindrome(str);
		System.out.println("Is '" + str + "' a palindrome? " + isPalindrome);
	}

	static boolean isPalindrome(String input) {
		String reversed = new StringBuilder(input).reverse().toString();
		return input.equalsIgnoreCase(reversed);

	}

}
