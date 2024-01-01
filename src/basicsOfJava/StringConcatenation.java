package basicsOfJava;

public class StringConcatenation {

	public static void main(String[] args) {

		// + : is concatenation operator
		// println - is used to print on the console or output with a new line
		// print - is just used to print on the console
		// execution of program always goes from left to right

		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "World";

		double c = 12.33;
		double d = 10.33;

		// execution of program always goes from left to right
		System.out.println(a + b);
		System.out.println(x + y);
		System.out.println(a + b + x + y); // 300HelloWorld
		System.out.println(x + y + a + b); // HelloWorld100200
		System.out.println(x + y + (a + b)); // HelloWorld300
		System.out.println(a + b + x + y + a + x + b + y); // 300HelloWorld100Hello200World
		System.out.println(a + b + x + y + a + b); // 300HelloWorld100200
		System.out.println(c + d);
		System.out.println(x + y + c + d); // HelloWorld12.3310.33

		System.out.println("The value of a is " + a);
		System.out.println("The addition of a and b is " + (a + b));

		System.out.println("Hello Selenium"); // ln means new line
		System.out.println("Hello Testing");

		System.out.print("Hello Selenium"); // if ln isn't provided then next statement is printed in same line
		System.out.println("Hello Testing");

		char c1 = 'a';// 97
		char c2 = 'b';// 98
		System.out.println(c1 + c2);// 195
		// a-z: 97 to 122
		// A-Z: 65 to 90
		// 0-9: 48 to 57

		System.out.println(c1 + "" + c2);

		byte b1 = 60;
		byte b2 = 50;
		System.out.println(b1 + b2);
		int b3 = b1 + b2;
		System.out.println(b3);

		int g = 10;
		int h = 3;
		System.out.println(g / h);// 3

		System.out.println(10 / 2);
		System.out.println(10.0 / 2);
		System.out.println(10.0 / 2.0);
		System.out.println(10 / 2.0);
		System.out.println(10 / 3.0);

		// System.out.println(9/0);//ArithmeticException
		System.out.println(0 / 9); // 0
		// System.out.println(0/0);//ArithmeticException
		System.out.println(0.0 / 0);// NaN - not a number
		System.out.println(0 / 0.0);// NaN
		System.out.println(0.0 / 0.0);// NaN
		System.out.println(5 / 0.0);// Infinity
		System.out.println(5.0 / 0.0);// Infinity

		char t = 'z';
		System.out.println((int) t);

	}

}
