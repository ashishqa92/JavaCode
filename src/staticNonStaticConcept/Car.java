package staticNonStaticConcept;

public class Car {

	String name;
	int price;
	String color;
	static int wheels = 4;

	// static class vars should be the common value (4) but non common property (name)
	// static is applicable for class-variables not for local variables
	
	/*
	 * If you declare any variable as static, it is known as a static variable.
	 * 
	 * 1. The static variable can be used to refer to the common property of all
	 * objects (which is not unique for each object), for example, the company name
	 * of employees, college name of students, etc.
	 * 2. The static variable gets memory only once in the class area at the time of class loading.
	 * 3. Static variables are stored in Meta space/ CMA -> common memory allocation
	 * 4. Static variables/methods are not part of objects
	 */

	public static void main(String[] args) {

		int i = 10;

		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 60;
		c1.color = "Blue";

		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 70;
		c2.color = "White";

		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 15;
		c3.color = "Black";

		System.out.println(c1.name + " :" + c1.price + " : " + c1.color+ " :"+ wheels);

		// how to access static vars:
		// no need to create the object
		// 1. within the same class, you can access them directly
		System.out.println(wheels);

		// 2. you can call by the class name:
		System.out.println(Car.wheels);

		// 3. call by object ref:
		System.out.println(c1.wheels);

	}

}