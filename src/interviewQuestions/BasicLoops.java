package interviewQuestions;

public class BasicLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Infinite while loop and example -> Digital Hording
		/*
		 * while(true) { System.out.println("Welcome to Taz..."); }
		 */
		
		//2. Infinite for loop and example -> Digital Hording
		/*
		 * for(; ;) { System.out.println("Welcome to Taz again ..."); }
		 */
		
		//3. Print A-Z using For Loop
		for (char c='A'; c<='Z'; c++) {
			System.out.println(c);
		}
		
		//4. Print a-z using the ASCII value and type casting
		for (int as=97; as<=122; as++) {
			System.out.println((char)as); // --> (char)as - is type casting we are changing data type from int to char
		}

	}

}
