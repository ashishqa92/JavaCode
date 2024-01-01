package arrayConcepts;

import java.util.ArrayList;

public class ArrayListCocept {

	public static void main(String[] args) {

		// ArrayList -- default class
		// need to create the object of ArrayList using new keyword
		// It maintains the order/index
		// When ArrayList is created then 10 segments of virtual memory are allocated.
		// As we start allocating the values, Physical Capacity will increase and
		// Virtual Capacity will decrease

		ArrayList ar = new ArrayList();

		System.out.println(ar.size());// pc=0 // In ArrayList we can determine size using .size() not like length in
										// static array

		ar.add(100);// 0 -> Index
		ar.add(200);// 1 -> Index

		System.out.println(ar.size());// pc = 2, size is 2, index is 0 and 1

		ar.add(300);// 2
		ar.add(400);// 3

		System.out.println(ar.size());

		ar.add(500);// 4
		ar.add(600);// 5
		ar.add(700);// 6
		System.out.println(ar.size());// 7

		ar.add(12.33);
		ar.add("testing");
		ar.add('n');
		ar.add(true);
		ar.add(500);

		System.out.println(ar.get(0));
		System.out.println(ar.get(6));
		// System.out.println(ar.get(7));//IndexOutOfBoundsException
		// System.out.println(ar.get(-1));//IndexOutOfBoundsException

		// ar.remove(5);
		// System.out.println(ar.get(5));
		// System.out.println(ar.size());//6

		// to print all the values from AL: use for loop:

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		/*
		 * for (Object e : ar) { System.out.println(e); }
		 */
	}

}
