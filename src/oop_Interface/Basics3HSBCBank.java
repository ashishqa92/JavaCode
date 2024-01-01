package oop_Interface;

/*We are achieving multiple inheritance below, HSBC bank have two parents i.e. USBank and BrazilBank
* Is-a relationship -- Interface to class relationship*/
public class Basics3HSBCBank implements Basic1USBank, Basics2BrazilBank {

	/*
	 * If a class is implementing an interface, its mandatory to define/override all
	 * methods of interface
	 */

	// Overriding below methods from USBank Interface
	@Override
	public void credit() {
		System.out.println("HSBC - credit");
	}

	@Override
	public void debit() {
		System.out.println("HSBC - debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC - trasnferMoney");
	}

	// Method of HSBC bank

	public void educationLoan() {
		System.out.println("HSBC - EducationLoan");
	}

	public void carLoan() {
		System.out.println("HSBC - CarLoan");
	}

	// Overriding below methods from BrazilBank method

	@Override
	public void mutualFund() {
		System.out.println(" HSBC - MutualFund");
	}

	@Override
	public void cashback() {
		System.out.println("Cashback offer example for multiple inheritance");

	}

}
