package superKeyword;

public class Page {

	/**
	 * The super keyword in Java is a reference variable which is used to refer
	 * immediate parent class object.
	 * Whenever you create the instance of subclass, an instance of parent class is
	 * created implicitly which is referred by super reference variable.
	 * 
	 * Usage of Java super Keyword:
	 * super can be used to refer immediate parent class
	 * instance variable. super can be used to invoke immediate parent class method.
	 * super() can be used to invoke immediate parent class constructor.
	 * [Constructor call must be the first statement in a constructor. Also we can't have 2 super calls in child constructor]
	 * 
	 */

	int timeOut = 100;

	public Page() {
		System.out.println("Page default...");
	}

	public Page(int a) {
		System.out.println("Page default..." + a);
	}

	public Page(int a, int b) {
		System.out.println("Page default..." + (a + b));
	}

	public void display() {
		System.out.println("Page Display");
	}

}
