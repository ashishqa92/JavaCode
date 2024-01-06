package mapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {

		// Map(I) <--- HashMap(C)

		/*
		 * HashMap never maintains any index/order. However, List contains. Hash map, we
		 * add anything using 'put (key, value)' in List we use 'add (value)' Has map to print we use get(key), in last we use get(index).
		 * In hashmap we should try to have duplicate keys (because it will give value of latest duplicate key).
		 * In hashmap values can be duplicate.
		 * In hashmap we can have null key. We can have multiple null keys as well however it will give value of latest null key.
		 */

		HashMap<String, String> empMap = new HashMap<String, String>();

		empMap.put("A", "Tom");
		empMap.put("B", "Peter");
		empMap.put("C", "Robert");

		System.out.println(empMap.get("A"));

		HashMap<String, Integer> studentMap = new HashMap<String, Integer>();
		studentMap.put("Tom", 100);
		studentMap.put("Peter", 200);
		studentMap.put("Peter", 300);
		studentMap.put("Naveen", 300);
		studentMap.put(null, 400);
		studentMap.put(null, 500);

		System.out.println("---------");
		studentMap.forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println("---------");

		System.out.println(studentMap.get("Peter"));
		System.out.println(studentMap.get(null));

		HashMap<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		m1.put(1, 100);
		m1.put(2, 300);

		HashMap<Integer, String> userMap = new HashMap<Integer, String>();
		userMap.put(101, "Tom");

	}

}
