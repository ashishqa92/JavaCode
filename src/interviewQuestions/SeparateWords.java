package interviewQuestions;

public class SeparateWords {

	public static void main(String[] args) {
		/**
		 * Write a program to separate all the words from the below sentence? Ex -
		 * String str =" Hello how are you ";
		 */
		String str = "  Hello        how     are     you   ";
		separateWords(str);
	}

	public static void separateWords(String str) {
		String[] wordArray = str.split("\\s+");
		for (String e : wordArray) {
			System.out.println(e);
		}
	}

}
