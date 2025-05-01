package interviewPracticeStarPattern;

public class A {
	
	/*
	 * 12345
       12345
       12345
       12345
       12345
	 */

	public static void main(String[] args) {
		int i;
		int j;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
