package oop_Interface;

public interface Basic1USBank {

	int min_bal = 100;

	public void credit();

	public void debit();

	public void transferMoney();

	public void cashback();

	/*
	 * Properties of Interface 
	 * 1. Only method declearation -- no method body -- Only method prototype
	 * 2. In Interface, we can declare variables, variables are by default static but methods are non-static 
	 * 3. Variable's value can't be changed, its final/constant in nature 
	 * 4. No static method in Interface, because Interface is part of OOP concept and object can't have static method
	 * 5. No main method in Interface
	 * 6. can't create object of Interface
	 * 7. Interface is abstract in nature, interface can not have the buss logic
	 * 8. Interface Can't be created as Final
	 */

}
