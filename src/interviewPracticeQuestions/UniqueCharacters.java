package interviewPracticeQuestions;

public class UniqueCharacters {

	public static void main(String[] args) {

		String str = "My Java Automation";
		boolean[] unique = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!unique[ch]) {
				unique[ch] = true;
				System.out.print(ch + " ");
			}
		}

	}

}
