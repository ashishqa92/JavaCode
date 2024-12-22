package arrayConcepts;

import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		//System.out.println(al.get(2));
		
		for (String e : al) {
			System.out.println(e);
		}

	}

}
