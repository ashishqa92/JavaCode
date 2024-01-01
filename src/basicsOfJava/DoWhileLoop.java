package basicsOfJava;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*Do While Loop: Same as while loop, except it test the condition at the end of the loop body
		 * 1. Statement printing (At-least one statement is printed always)
		 * 2. Increment/Decrement
		 * 3. Checks condition
		 * Use Case: Custom wait of elements
		 * */
		
		int i=1;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);

	}

}
