package interviewPracticeQuestions;

public class FactorialNumber {

	public static int isFactorial(int num) {
		System.out.println("Calculating the factorial for " + num);
		int fact = 1;

		if (num == 0) {
			return 1;
		} else {
			for (int i = 1; i < num; i++) {
				fact = fact * i;
			}
			return fact;
		}
	}

	public static void main(String[] args) {
		int factorial = isFactorial(5);
		System.out.println("Factorial of provided number is: " + factorial);
	}

}
