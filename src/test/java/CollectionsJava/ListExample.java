package CollectionsJava;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();

		stringList.add("India");
		stringList.add("UAE");
		stringList.add("London");
		stringList.add("US");

		System.out.println("First element: " + stringList.get(0));

		stringList.remove(1);

		System.out.println("Second element: " + stringList.get(1));
	}
}
