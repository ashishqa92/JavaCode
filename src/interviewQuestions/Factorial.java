package interviewQuestions;

public class Factorial {

	public static void main(String[] args) {
		// Write a program for factorial of any enter number?

		int number = 5;
		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i; // 1*2*3*4*5
		}

		System.out.println(fact);

	}

}
