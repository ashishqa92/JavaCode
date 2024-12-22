package javaInterviewQuestions;

import java.util.Arrays;

public class MissingNumberInArray {

	public static int findMissingNumber(int[] a) {
		Arrays.sort(a); // sorting the array
		int n = a.length + 1; // expected length of array i.e. actual length + 1 missing number
		int sumExpected = n * (n + 1) / 2; // sum of the array expected including missing number
		int sumActual = 0;

		for (int e : a) {
			sumActual = sumActual + e; // sum of the actual array
		}

		return sumExpected - sumActual;
	}

	public static void main(String[] args) {
		int[] a = { 4, 1, 2, 5, 3, 7, 8 };
		int missingNumber = findMissingNumber(a);
		System.out.println("The missing number is: " + missingNumber);
	}

}
