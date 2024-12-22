package basicsOfJava;

public class DataTypes {

	public static void main(String[] args) {
		
		/* 
		 * Data Types: Means what are the various type of data we can have in a particular language.
		 * 
		 * Important Point: Java is not 100% objective programming language because it has primitive data type.
		 * These data types doesn't need objects to be created.

          Types:
           A. Primitive Data Type
             1. Numeric
               i Integral
                  * Integer
                     o byte (size: 1 byte i.e. 8 bits, range: -128 to 127 => -2^7 to 2^7-1)
                     o short (size: 2 bytes, range: -32768 to 32767 => -2^15 to 2^15-1)
                     o int (size: 4 bytes, range: - 2147483648 to 2147483647 => -2^31 to 2^31-1)
                     o long (size: 8 bytes, range: - 9023372036854775808 to 9023372036854775807 => -2^63 to 2^63-1) 
                    * Floating Point
                     o float (size: 4 bytes, range: after point upto 7 decimal digits)
                     o double (size: 8 bytes, rage: after point upto 16 decimal digits)
                ii. Character
                     o char (size: 2 bytes, range: 0-9 or a-z or A-Z or any special char)
             2. Boolean
                     o boolean (size: ~1 bit, range/value: true or false)

            B. Non-Primitive Data Type
                 - String
                 - Arrays
                 - Class
                 
                 */
		
		// byte
		   byte b = 10;
		   System.out.println(b);
		
		// short
		   short s = 3398;
		   System.out.println(s);
		   
		// int
		   int i = 251419;
		   System.out.println(i);
		   
		// long
		   long l = 911905251419L;
		   System.out.println(l);
		   
		// float
		   float f = 25.985f;
		   float f1 = (float)25.986;
		   System.out.println(f);
		   System.out.println(f1);
		   
		// double
		   double d = 278.123456789;
		   System.out.println(d);
		   
		// char
		   char c = 'A';
		   System.out.println(c);
		   
		// boolean
		   boolean flag1 = true;
		   boolean flag2 = false;
		   System.out.println(flag1);
		   System.out.println(flag2);

	}

}
