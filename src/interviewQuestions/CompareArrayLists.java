package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayLists {

	public static void main(String[] args) {
		// Write a program to compare two array list?
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        boolean isEqual = list1.equals(list2);
        System.out.println("Are the ArrayLists equal? " + isEqual);
	}

}
