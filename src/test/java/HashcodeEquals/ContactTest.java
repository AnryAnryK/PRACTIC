package HashcodeEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ContactTest {
	@Test
	public void test1() {
		Contact contact1 = new Contact(1, "Вася");
		Contact contact2 = new Contact(1, "Вася");

		System.out.println(contact1.hashCode());
		System.out.println(contact2.hashCode());

		System.out.println(contact1.equals(contact2));

	}
}