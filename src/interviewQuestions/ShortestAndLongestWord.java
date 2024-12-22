package interviewQuestions;

public class ShortestAndLongestWord {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog";

		String[] words = sentence.split("\\s+");

		String shortestWord = words[0];
		String longestWord = words[0];

		for (String e : words) {
			if (e.length() < shortestWord.length()) {
				shortestWord = e;
			}
			if (e.length() > longestWord.length()) {
				longestWord = e;
			}
		}

		System.out.println("Shortest word: " + shortestWord);
		System.out.println("Longest word: " + longestWord);

	}

}
