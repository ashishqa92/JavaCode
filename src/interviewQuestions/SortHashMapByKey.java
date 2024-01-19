package interviewQuestions;

import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMapByKey {

	public static void main(String[] args) {
		//Write a program to sort HashMap by key?
		HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(8, "Eight");
        map.put(1, "One");

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted HashMap by Key: " + sortedMap);

	}

}
