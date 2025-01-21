package CollectionsJava;

import java.util.Set;
import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {

		Set<String> stringSet = new HashSet<>();

		stringSet.add("Jan");
		stringSet.add("Feb");
		stringSet.add("March");
		stringSet.add("April");

		if (stringSet.contains("March")) {
			System.out.println("The set contains the element 'March'");
		}

		stringSet.remove("April");

		if (!stringSet.contains("April")) {
			System.out.println("The set no longer contains the element 'April'");
		}
	}
}
