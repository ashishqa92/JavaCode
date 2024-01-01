package basicsOfJava;

public class WhileLoop {

	public static void main(String[] args) {
		/* While loop : repeats a statement or group of statements while a logic condition is true.
		 * It tests the condition before executing the loop body.
		 * 1.Initialization/checks condition  2.Printing 3.Increment/Decrement
		 * Disadvantage: It will generate infinite loop, if you don't give any incremental/decremental part
		 * Use Cases of while loop are:-
		 * When we are not sure about number of iterations/cycles.
		 * Example:- Pagination, Calendar, Carousel etc.  
		 * */
		
		int i=1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------------------");
		
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
		
		System.out.println("---------------------");
		
		//break can be used in while loop as well just like switch statements.
		
		int k=1;
		while(true) {
			System.out.println(k);
			k++;
			if(k==20) {
				break;
			}
		}
		
		System.out.println("---------------------");
		
		// Example of infinite while loop in real case
		
//		while(true) {
//			System.out.println(" This is an digital hording of Taz --> Welcome to Taz");
//		}

	}

}
