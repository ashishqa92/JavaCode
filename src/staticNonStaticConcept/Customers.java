package staticNonStaticConcept;

public class Customers {

	String name;
	int id;
	static String city = "Bangalore";
	static String paymentMethod = "CC";

	public void getInfo() {
		System.out.println("get info....");
	}
	
	/*
	 * If you apply static keyword with any method, it is known as static method.
	 * 
	 * A static method belongs to the class rather than the object of a class.
	 * A static method can be invoked without the need for creating an instance of a class. 
	 * A static method can access static data member and can change the value of it.
	 */

	public static void sendMail() {
		System.out.println("send mail....");
	}

	public static void main(String[] args) {

		Customers obj = new Customers();

		// how to call static methods:
		// 1. call directly:
		sendMail();
		obj.getInfo();

		// 2. using class name:
		Customers.sendMail();

		// 3. using obj ref:
		obj.sendMail();

	}

}
