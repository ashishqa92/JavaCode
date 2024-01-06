package staticNonStaticConcept;

public class StaticBlock {
	
	/**
	 * Main method is compulsory while running any Java program, as JVM will always look for main() method.
	 * However if we want to execute/print something before main method, then it can be achieved with static block.
	 * static block loads at the time of class loading and is executed before main method.
	 */

	static {
		System.out.println("static block");
	}
	
	public static void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {

		System.out.println("this is main");
		test();
		
	}

}
