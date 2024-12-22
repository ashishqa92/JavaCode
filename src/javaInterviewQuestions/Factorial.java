package javaInterviewQuestions;

public class Factorial {

	/*
	 * Factorial of a number is the product of all positive integers up to that
	 * number. It is denoted by the symbol n!
	 */

	public static int factorialNumber(int num) {
		int fact = 1;
		while (num >= 1) {

			fact = fact * num;
			num--;
		}
		/*
		 * for (int i = num; i > 0; i--){
		 *  fact = fact * i; // 5*4*3*2*1
		 *   }
		 */

		return fact;
	}

	public static void main(String[] args) {

		int factorial = Factorial.factorialNumber(5);
		System.out.println("Factorial of the given number is: " + factorial);

	}

}
