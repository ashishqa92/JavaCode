package arrayConcepts;

import java.util.HashSet;

public class HashSetConcept {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");
		  set.add("Ashish");
		  
		  for (String e: set) {
			  System.out.println(e);
		  }

	}

}
