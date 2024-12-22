package javaInterviewQuestions;

public class SwapVariables {

	// Write a program to swap two string variables without using temp variable?
	public static void swapWithoutTemp(int num1, int num2) {
		int a = num1;
		int b = num2;

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("Value of num1 after swap: " + a);
		System.out.println("Value of num2 after swap: " + b);
	}

	// here we will swap by using temp variable
	public static void swapWithTemp(int num1, int num2) {
		int a = num1;
		int b = num2;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("Value of num1 after swap: " + a);
		System.out.println("Value of num2 after swap: " + b);
	}

	public static void main(String[] args) {
		SwapVariables.swapWithoutTemp(10, 5);
		SwapVariables.swapWithTemp(5, 10);

	}

}
