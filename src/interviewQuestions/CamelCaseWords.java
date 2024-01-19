package interviewQuestions;

public class CamelCaseWords {

	public static void main(String[] args) {
		// Write a program to find words from the given Camelcasing string?
		// Ex - String word = "IAmAJavaProgrammerWhatAboutYou";
		String word = "IAmAJavaProgrammerWhatAboutYou";
        String[] words = word.split("(?=[A-Z])");
        
        for (String e : words) {
            System.out.println(e);
        }
	}

}
