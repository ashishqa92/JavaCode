package interviewPracticeQuestions;

public class VowelCount {

	//Write a program to find vowels count in a string?
	public static void main(String[] args) {

		String str = "Programming is fun for ashish";
		str = str.toLowerCase();
		int stringLength = str.length();

		int vowelCount = 0;
		for (int i = 0; i < stringLength; i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		System.out.println(vowelCount);

	}

}
