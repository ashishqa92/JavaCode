package oop_Encapsulation;

public class Employee {

	public static void main(String[] args) {

		// Accessing data from Company class
		Company c1 = new Company();

		c1.name = "MS";
		c1.hq = "HYD";

		System.out.println(c1.name);
		System.out.println(c1.hq);

		c1.setSharePrice(1000);

		int p1 = c1.getSharePrice();
		System.out.println(p1);

	}

}
