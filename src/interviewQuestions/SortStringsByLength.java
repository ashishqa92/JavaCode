package interviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;

public class SortStringsByLength {

	public static void main(String[] args) {
		// Write a program sort string of ArraList as per the length of the string?
		
		ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("grape");

        // Sort strings by length
        stringList.sort(Comparator.comparingInt(String::length));

        // Display sorted strings
        System.out.println("Sorted Strings by Length: " + stringList);

	}

}
