package javaInterviewQuestions;

public class Test {

	public static void isArmstrongNumber(int number) {

		int remainder = 0;
		int cube = 0;
		int originalNumber;
		
		originalNumber = number;
		
		while(number>0) {
			remainder = number%10;
			cube = cube + (remainder*remainder*remainder);
			number = number/10;
		}
		if (originalNumber == cube) {
			System.out.println(originalNumber + " is an Armstrong number");
		}
		else {
			System.out.println(originalNumber + " isn't an Armstrong number");
		}
		
	}

	public static void main(String[] args) {

		isArmstrongNumber(125);
	}

}
