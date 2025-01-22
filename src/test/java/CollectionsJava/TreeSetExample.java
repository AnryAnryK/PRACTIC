package CollectionsJava;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();


		set.add("apple");
		set.add("banana");
		set.add("orange");

		set.add("apple");

		System.out.println("Tree set: " + set);

		set.remove("banana");

		System.out.println("Tree set: " + set);
	}
}
