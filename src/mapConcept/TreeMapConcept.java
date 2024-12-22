package mapConcept;

import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");  
	      map.put(101,"ashu");
	      
	      map.forEach((k,v) -> System.out.println(k+":"+v));

	}

}
