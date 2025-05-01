package interviewPracticeQuestions;

public class VowelCount {

	// Write a program to find vowels count in a string?
	public static void main(String[] args) {

		String str = "Programming is fun for ashish";
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();

		int vowelCount = 0;
		int consonants = 0;

		for (char c : charArray) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCount++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("vowel count : " + vowelCount);
		System.out.println("consonants count : " + consonants);

	}

}
