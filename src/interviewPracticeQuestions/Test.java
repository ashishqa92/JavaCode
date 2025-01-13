package interviewPracticeQuestions;

public class Test {
	public static void main(String[] args) {

		System.out.println(isFactorialNumber(-1));

	}

	public static int isFactorialNumber(int num) {

		int fact = 1;
		
		if(num == 0) {
			return 1;
		}
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
	}

}