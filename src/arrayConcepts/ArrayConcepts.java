package arrayConcepts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		// Array: To store the similar data types value in a array variable

		/*
		 * One Dimensional Arrray - lowest bound/index = 0 - upper bound/index = n-1
		 * int array: - ArrayIndexOutOfBoundsException is thrown if we try to print the
		 * value of index (greater than n-1) that doesn't exist - i.length gives
		 * size/length of an array
		 */

		/*
		 * Disadvantages of array:- 
		 * -- index/size is fixed, its called static array 
		 * -- To overcome this problem we use collections like ArrayList, Hashtable (dynamic array)
		 * -- Store only similar data types
		 * -- To overcome this problem we use Object array
		 * 
		 * /two major limitations:
		//1. size is fixed (static array): to overcome this problem, use dynamic array -- ArrayList
		//2. similar type of data: to overcome this problem, use dynamic array -- ArrayList/Static Object Array
		//3. Wastage of Memory in case if we aren't using all the indexes that are defined while declaring array
		 */

		// 1. int aray:
		int i[] = new int[4];
		i[0] = 5;
		i[1] = 7;
		i[2] = 4;
		i[3] = 7;
		System.out.println(i[3]);
		System.out.println(i.length);

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		// Print Using FOR EACH LOOP
		/*
		 * write for keyword initially, then in braces write data type of array and add any
		 * variable/element, say e, now give colon (:) and then provide array name.
		 * Lastly print the value of element not the array name.
		 */
		for (int e : i) {
			System.out.println(e); // e will go to i every-time like i[0], [1], [2]
		}

		// 2. Double array
		double d[] = new double[3];
		d[0] = 1;
		d[1] = 2;
		d[2] = 3;

		System.out.println(d[2]);

		// 3. char array
		char c[] = new char[2];
		c[0] = 'A';
		c[1] = 'b';
		System.out.println(c[0]);

		// 4. boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[1]);

		// 5. String array
		String s[] = new String[3];
		s[0] = "Ashish";
		s[1] = "Trantor";
		s[2] = "QA";
		System.out.println(s[1]);

		// Object is a superclass of all the classes
		Object ob[] = new Object[6];
		ob[0] = "Ashish";
		ob[1] = "E00656";
		ob[2] = 10.36;
		ob[3] = 21;
		ob[4] = 'A';
		ob[5] = true;

		System.out.println(ob[2]);
		System.out.println(ob.length);

		// For Loop and For Each Loop
		String lang[] = new String[5];
		lang[0] = "Java";
		lang[1] = "C#";
		lang[2] = "Python";
		lang[3] = "JS";
		lang[4] = "Ruby";

		for (int l = 0; l < lang.length; l++) {
			System.out.println(l + ":" + lang[l]);
		}

		// FOR EACH LOOP
		int index=0;
		for (String st : lang) {
			System.out.println(index+":"+st);
			index++;
		}
		
		//Array Literals
		int k[] = {7, 11, 12, 1, 2, 3, 4, 5, 6};
		Arrays.sort(k);
		System.out.println(k.length);
		System.out.println(Arrays.toString(k));
		
		//int count=0;
		for (int e : k) {
			System.out.println(e);
		}

	}

}
