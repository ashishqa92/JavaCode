package interviewQuestions;

public class TraverseWithoutVariable {

	public static void main(String[] args) {
		// Traverse two number without using extra variable?

		int a = 5, b = 10;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping: a=" + a + ", b=" + b);

	}

}
