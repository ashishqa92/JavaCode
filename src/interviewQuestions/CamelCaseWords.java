package interviewQuestions;

public class CamelCaseWords {

	public static void main(String[] args) {
		// Write a program to find words from the given Camelcasing string?
		// Ex - String word = "IAmAJavaProgrammerWhatAboutYou";
		String word = "IAmAJavaProgrammerWhatAboutYou";
		camelCaseWord(word);
	}

	public static void camelCaseWord(String str) {
		String[] word = str.split("(?=[A-Z])");

		for (String e : word) {
			System.out.println(e);
		}
	}

}