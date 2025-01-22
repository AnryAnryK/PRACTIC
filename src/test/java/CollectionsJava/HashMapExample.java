package CollectionsJava;


import java.util.HashMap;
import java.util.Map;


public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();


		map.put("apple", 1);
		map.put("banana", 2);
		map.put("orange", 3);

		System.out.println("Hash map: " + map);

		int value = map.get("banana");
		System.out.println("Value for 'banana': " + value);

		map.remove("orange");

		System.out.println("Hash map: " + map);
	}
}
