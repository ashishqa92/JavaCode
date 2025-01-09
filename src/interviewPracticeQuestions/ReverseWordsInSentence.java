package interviewPracticeQuestions;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// Write a program to read the given sentence and every word in the sentence
		// reverse and keep it in same position?
		// Ex - "Testing world" should look like : "gnitseT dlrow"

		String sentence = "Testing world is fun for Testers";
		String[] words = sentence.split("\\s+");

		String reversedSentence = "";

		// Reverse each word using nested loops
		for (String e : words) {
			String reversedWord = "";
			for (int i = e.length() - 1; i >= 0; i--) {
				reversedWord = reversedWord + e.charAt(i); // Append characters in reverse order
			}
			reversedSentence = reversedSentence + reversedWord + " "; // Append reversed word to the result
		}

		System.out.println(reversedSentence.trim());
	}

}
