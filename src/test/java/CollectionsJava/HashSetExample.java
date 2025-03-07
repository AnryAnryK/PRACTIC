package CollectionsJava;


import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("rose");
		set.add("lily");
		set.add("lotus");

		set.add("rose");

		System.out.println("Hash set: " + set);
		System.out.println("Содержит rose: "  + set.contains("rose"));

		set.remove("lily");

		System.out.println("Hash set: " + set);
		System.out.println("Размер множества set " + set.size());
	}
}
