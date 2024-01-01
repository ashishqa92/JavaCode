package practiceQuestions;

public class FactorialNumber {
	
	/*
	 * Factorial Program in Java: Factorial of n is the product of all positive
	 * descending integers. Factorial of n is denoted by n!. For example:
	 * 4! = 4*3*2*1 = 24  
	 * 5! = 5*4*3*2*1 = 120  
	 */
	
	// Without Recursion -- using For loop
	public static int Factorial(int num) {
		
		int fact = 1;
		
		if (num == 0) 
		{
			return 1;
		}
		
		for (int i=1; i<=num; i++)
		{
			fact = fact*i; // 1*2*3*4*5
		}
		
		return fact;
		
	}

	public static void main(String[] args) {
		
		System.out.println(Factorial(5));

	}

}
