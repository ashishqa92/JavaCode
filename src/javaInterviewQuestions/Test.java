package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Test {

	public static void reverseWords(String s) {

		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {

		String s = "Java programming hello world for Ashish";

		Test.reverseWords(s);
	}

}
