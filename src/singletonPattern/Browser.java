package singletonPattern;

public class Browser {
	
	/*
	 * The Singleton pattern in Java is a design pattern that restricts the
	 * instantiation of a class to one "single" instance. This is useful when
	 * exactly one object is needed to coordinate actions across the system. The
	 * Singleton pattern ensures that a class has only one instance and provides a
	 * global point of access to that instance.
	 */

	// 1. Private static instance of the class
	private static Browser browser;

	// 2. Private constructor to prevent/avoid object creation
	private Browser() {
	}

	// 3. Public static getInstance method to provide access to instance/object
	public static Browser getInstance() {
		if (browser == null) {
			browser = new Browser();
		}
		return browser;
	}

	// Individual public method of class
	public void displayMessage() {
		System.out.println("Browser info");
	}

}
