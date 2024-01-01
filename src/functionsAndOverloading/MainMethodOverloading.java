package functionsAndOverloading;

public class MainMethodOverloading {
	
	//We can overload the main method. Although we don't overload the main method, but it can be overloaded
	// But remember that the JVM always calls the original main() method. 
	// It does not call the overloaded main() method.
	// JVM will look for public static void main(String array arguments)

	public static void main(String[] a) {
		System.out.println("Main 1");
	}

	public static void main(int a) {

		System.out.println("Main 2" + a);

	}

	public static void main(String a) {

		System.out.println("Main 4" + a);

	}

	public static void main(int a, int b) {

		System.out.println("Main 3" + a + b);

	}

}
