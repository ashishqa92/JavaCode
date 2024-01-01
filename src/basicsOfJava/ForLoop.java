package basicsOfJava;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// for is keyword in java
		/*For Loop: Execute a sequence of statements multiple times
		 * for (initialize; condition; inc/dec
		 * For loop use cases:-
		 * When we are sure about number of iterations/cycles
		 * Example:- Menu item, drop-down, total number of links/images in a page
		 * */
		
		// Print 1-10
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("----------------");
		//Print 10 to 1
		for (int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		System.out.println("----------------");
		//Print even number from 1-10
		for (int k=2; k<=10; k=k+2) {
			System.out.println(k);
		}
		
		// another logic
		for (int k1=1; k1<=10; k1++) {
			if (k1%2==0) {
				System.out.println(k1);
			}
		}
		
		System.out.println("----------------");
		//Print odd number from 1-10
		for (int l=1; l<=10; l=l+2) {
			System.out.println(l);
		}
		
		// another logic
		for (int a=1; a<=10; a++) {
			if(a%2 != 0) {
				System.out.println(a);
			}
		}
		
		System.out.println("----------------");
		
		// Print A-Z using For Loop
		for (char c='A'; c<='Z'; c++) {
			System.out.println(c);
		}
		
		// Print a-z using the ASCII value and type casting
		for (int as=97; as<=122; as++) {
			System.out.println((char)as); // --> (char)as - is type casting we are changing data type from int to char
		}
		
		System.out.println("----------------");
		// Infinite For Loop
		/*
		 * for ( ; ; ) { System.out.println("Welcome to taz once again.."); }
		 */
	}

}
