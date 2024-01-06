package oop_Encapsulation;

   /*Encapsulation in Java is a process of wrapping code and data together into a single unit, 
    * We can create a fully encapsulated class in Java by making all the data members of the class private. 
      Now we can use setter and getter methods to set and get the data in it.
    for example, a capsule which is mixed of several medicines. Or a Laptop, we can use it, but can't see circuits.
    We are basically hiding the internal property and giving the access to public layer
   
   Another example is ATM, we can't access the internal system of ATM
   Go to Eclipse -> right click -> source -> Generate getters and setters
   */

public class Company {

	public String name;
	private int sharePrice;
	public String hq;

	// setter: will be used in Employee Class
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	// getter: will be used in another class named Employee
	public int getSharePrice() {
		return sharePrice;
	}

	public static void main(String[] args) {

		Company obj = new Company();
		obj.name = "IBM";
		obj.sharePrice = 100;

	}

}
