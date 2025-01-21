package CollectionsJava;

import java.util.LinkedList;
import java.util.List;


public class LinkedListExample {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();

		list.add("selenium");
		list.add("cypress");
		list.add("playwright");

		System.out.println("Linked list: " + list);

		list.add(0, "webdriver.io");

		System.out.println("Linked list: " + list);

		list.remove(0);

		System.out.println("Linked list: " + list);
	}
}
