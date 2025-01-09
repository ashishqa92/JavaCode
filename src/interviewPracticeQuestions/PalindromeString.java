package interviewPracticeQuestions;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "radar";
		boolean isPalindrome = isPalindrome(str);
		System.out.println("Is '" + str + "' a palindrome? " + isPalindrome);
	}

	static boolean isPalindrome(String inputString) {
		String reversed = new StringBuilder(inputString).reverse().toString();
		return inputString.equals(reversed);

	}

}
