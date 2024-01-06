package exceptionHandling;

public class ThrowsKeyword {
	/*
	 * The Java throws keyword is used to declare an exception. It gives an
	 * information to the programmer that there may occur an exception. So, it is
	 * better for the programmer to provide the exception handling code so that the
	 * normal flow of the program can be maintained.
	 * 
	 * IMP: it is basically used to pass/declare an exception. In below example m();
	 * is the producer or culprit for throwing exception because of 9/0, so if m3
	 * isn't able to handle to exception then it has to use 'throws' keyword with
	 * type of exception in method signature. now its the responsibility of consumer
	 * of this method i.e. m2 to handle to exception. Though m2 can also the pass
	 * the exception then m1 has to handle it, then m1 can also pass then main
	 * method has to handle it. But for sure exception needs to be handled, JVM
	 * won't handle it automatically. We have to write try catch block somewhere.
	 * 
	 */

	public void m1() {
		System.out.println("m1");
		m2();
	}

	public void m2() {
		System.out.println("m2");
		try {
			m3();
		} catch (ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
	}

	public void m3() throws ArithmeticException {
		System.out.println("m3");
		int i = 9 / 0;
	}

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("Bye...");

	}

}
