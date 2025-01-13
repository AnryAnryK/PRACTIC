package HashcodeEquals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.and;
import static org.junit.jupiter.api.Assertions.*;


public class ContactTest {
	@Test
	public void test1() {
		Contact contact1 = new Contact(1, "Вася");
		Contact contact2 = new Contact(1, "Вася");
		Contact contact3 = new Contact(1, "Вася");
		Contact contact4 = new Contact(1, "Вася");

		System.out.println(contact1.hashCode());
		System.out.println(contact2.hashCode());
		System.out.println(contact3.hashCode());
		System.out.println(contact4.hashCode());

		System.out.println(contact1.equals(contact2));
		System.out.println(contact2.equals(contact3));

		System.out.println(contact1.equals(contact2) && contact2.equals(contact3) && contact3.equals(contact4));  // удобный вариант написания сравнения "в-одну-строчку"





	}
}