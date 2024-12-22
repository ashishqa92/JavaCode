package javaInterviewQuestions;

import java.util.Arrays;

public class HighestValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 7, 9, 2, 4, 6, 11, 1, 8 };

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		System.out.println("Highest number is: " + a[a.length - 1]);
		System.out.println("Second highest number is: " + a[a.length - 2]);
		System.out.println("Highest number is: " + a[0]);

		/*
		 * int max = a[0]; int min = a[0]; for(int i=0; i<a.length; i++) { if(a[i] >
		 * max) { max = a[i]; }
		 * 
		 * if (a[i] < min) { min = a[i]; } } System.out.println(max);
		 * System.out.println(min);
		 */
	}

}
