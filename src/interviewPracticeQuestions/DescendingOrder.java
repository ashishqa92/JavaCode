package interviewPracticeQuestions;

import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {

		int[] arr = { 5, 2, 9, 1, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int e : arr) {
			System.out.println(e);
		}

//		//Second Way
//		Arrays.sort(arr);
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}
//		
//		// Third Way
//		Arrays.sort(arr);
//		int count = 0;
//		int[] newArr = new int[arr.length];
//		for (int i = arr.length - 1; i >= 0; i--) {
//			newArr[count] = arr[i];
//			count++;
//		}
//		System.out.println(Arrays.toString(newArr));

	}

}
