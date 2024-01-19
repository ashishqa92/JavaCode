package interviewQuestions;

public class PasswordCheck {

	public static void main(String[] args) {
		/**
		 * Write a program to check below password is acceptable or not? Conditions for
		 * password: - Length should be 8 character - It should contain alphabates,
		 * numbers and special characters Ex : String password = "Ting123*";
		 */

		String password = "Ting123*";
		if (password.length() == 8 && password.matches(".*[a-zA-Z].*") && password.matches(".*\\d.*")
				&& password.matches(".*[^a-zA-Z\\d].*")) {
			// Contains at least one alphabet character
			// Contains at least one digit
			// Contains at least one special character
			System.out.println("Password is acceptable");
		} else {
			System.out.println("Password is not acceptable");
		}
	}

}
