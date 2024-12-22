package oop_Concepts;

public class User {

	String name;
	int age;
	String city;
	
	private static final void login() {
		System.out.println("Login");
	}
	
	private static final void login (String un) {
		System.out.println("Login wih "+ un);
	}

	public static void main(String[] args) {
		

		User u1 = new User();
		u1.name = "A";
		u1.age = 25;
		u1.city = "Pune";

		User u2 = new User();
		u2.name = "B";
		u2.age = 30;
		u2.city = "Delhi";

		User u3 = new User();
		u3.name = "C";
		u3.age = 27;
		u3.city = "Bangalore";
		
		User u4 = new User();
		u4.name = "D";
		u4.age = 26;
		u4.city = "Hyd";

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		System.out.println("--------------");
		
		u1 = u2;

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		System.out.println("--------------");

		u2 = u3;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		System.out.println("--------------");
		
		u3 = u4;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		System.out.println("--------------");

		u4 = u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);

		// object ref:
		// no ref -- true
		// one ref -- true
		// multi ref -- true
		login();
		login("test");
	}

}
