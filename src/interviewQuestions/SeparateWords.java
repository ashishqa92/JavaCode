package interviewQuestions;

public class SeparateWords {

	public static void main(String[] args) {
		/**
		 * Write a program to separate all the words from the below sentence?
		 * Ex - String str ="  Hello        how     are     you   ";
		 */
		String str ="  Hello        how     are     you   ";
		String[] words = str.split("\\s+"); 
		//Split the input sentence into an array of words using one or more whitespace characters (\\s+) as the delimiter.
		
		for(String e: words) {
			System.out.println(e);
		}
		
	}

}
