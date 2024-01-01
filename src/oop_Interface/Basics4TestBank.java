package oop_Interface;

public class Basics4TestBank {

	public static void main(String[] args) {

		System.out.println(Basic1USBank.min_bal);
		// USBank.min_bal = 200; -- Variable's value of Interface can't be changed

		// USBank us = new USBank();
		Basics3HSBCBank hs = new Basics3HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		hs.cashback();

		// Dynamic Polymorphism
		// Child class variable can be referred by parent interface interface var

		Basic1USBank us = new Basics3HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
		hs.cashback();

		Basics2BrazilBank bz = new Basics3HSBCBank();
		bz.mutualFund();
		bz.cashback();

	}

}
