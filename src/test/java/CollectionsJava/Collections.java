package CollectionsJava;

import java.util.*;

public class Collections {
	public static void main(String[] args) {
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("яблоко");
		fruits.add("банан");
		fruits.add("апельсин");
		fruits.add("яблоко");
		fruits.add("виноград");
		System.out.println(fruits);

		Map<String, Integer> fruits2 = new HashMap<>();
		fruits2.put("яблоко", 6);
		fruits2.put("банан", 5);
		fruits2.put("апельсин", 8);
		fruits2.put("виноград", 8);
		fruits2.put("яблоко", 7);
		System.out.println(fruits2);
		
String [][] cats = new String [][]{{"1", "2", "3", "4", "5",}, {"1", "2", "3", "4", "5"}};
		System.out.println(Arrays.toString(new String[]{cats[0][2]}));;


		String [] cats2 = new String []{"1", "2", "3", "4", "5",};
		System.out.println(cats2[4]);;
	}
}
