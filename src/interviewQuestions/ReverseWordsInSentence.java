package interviewQuestions;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// Write a program to read the given sentence and every word in the sentence
		// reverse and keep it in same position?
		// Ex - "Testing world" should look like : "gnitseT dlrow"

		String str = "Testing world ashish kumar";
		String[] st = str.split("\\s+");
		String reverse = "";
		for (int i = 0; i < st.length; i++) // length = 4
			{
			for (int j = st[i].length() - 1; j >= 0; j--) {
				reverse = reverse + st[i].charAt(j);
			}
			reverse = reverse + " ";
		}

		System.out.println(reverse);
	}

}
