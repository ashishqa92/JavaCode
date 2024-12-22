package stringConcepts;

public class StringImmutable {

	public static void main(String[] args) {
		/**
		 * A String is an unavoidable type of variable while writing any application
		 * program. String references are used to store various attributes like
		 * username, password, etc. In Java, String objects are immutable. Immutable
		 * simply means unmodifiable or unchangeable. Once String object is created its
		 * data or state can't be changed but a new String object is created.
		 * 
		 */

		String s = "Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable objects

		// Two objects are created but s reference variable still refers to "Sachin" not
		// to "Sachin Tendulkar".

		/**
		 * But if we explicitly assign it to the reference variable, it will refer to
		 * "Sachin Tendulkar" object.
		 */
		
		String st = "Sachin";
		st = s.concat(" Tendulkar");
		System.out.println(st);

		/**
		 * Why String objects are immutable in Java? -- As Java uses the concept of
		 * String literal. Suppose there are 5 reference variables, all refer to one
		 * object "Sachin". If one reference variable changes the value of the object,
		 * it will be affected by all the reference variables. That is why String
		 * objects are immutable in Java.
		 */

	}

}
