package CollectionsJava;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("qa");
		list.add("devops");
		list.add("dev");

		System.out.println("Array list: " + list);

		String element = list.get(1);
		System.out.println("Element at index 1: " + element);

		list.remove(1);

		System.out.println("Array list: " + list);
	}
}
