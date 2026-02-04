package interviewPracticeQuestions;

public class ReverseStringWords {

	public static void main(String[] args) {
		/*
		 * Write a program to reverse the given string and count the occurance of letter
		 * "a". Ex : String s = "Java programming hello world"; Output : world hello
		 * programming Java a = 3
		 */

		String s = "Java programming hello world";
		reverseSentenceEachWord(s);

	}

	public static void reverseSentenceEachWord(String str) {
		
//		String reversed = "";
//		for(int i = str.length()-1; i>=0; i--) {
//			reversed = reversed+str.charAt(i);
//		}
//		
//		System.out.println(reversed);
		
		String reversed = new StringBuffer(str).reverse().toString();
		System.out.println(reversed);
	}

}
