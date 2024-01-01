package basicsOfJava;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		// ++
		// --

		int i = 1;
		int j = i++; // post increment - give the original value of i to j and then increase i by 1
		System.out.println(i); //2
		System.out.println(j); //1

		int a = 1;
		int b = ++a; // pre-increment - increment he value of a by 1 then give it to b
		System.out.println(a); //2
		System.out.println(b); //2

		int m = 2;
		int n = m--; // post decrement
		System.out.println(m); //1
		System.out.println(n); //2

		int l = 2;
		int k = --l; // pre-decrement
		System.out.println(l); //1
		System.out.println(k); //1

	}

}
