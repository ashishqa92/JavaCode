package interviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;

public class SortIntegersDescending {

	public static void main(String[] args) {
		// Write a program to sort ArrayList of Integers in descending order using streams?
		
		ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(5);
        integerList.add(8);
        integerList.add(20);

        // Sort integers in descending order using streams
        integerList.sort(Comparator.reverseOrder());

        // Display sorted integers
        System.out.println("Sorted Integers in Descending Order: " + integerList);

	}

}
