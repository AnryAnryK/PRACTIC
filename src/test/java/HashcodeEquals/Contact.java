package HashcodeEquals;

import org.junit.jupiter.api.Test;

import java.util.Objects;

// 1 - создаем класс с переменными
public class Contact {
	int id;
	String name;



	public Contact(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// 2- далее переопределяем метод @Override по equals и hashCode (через Генерацию кода в Идее))

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Contact contact = (Contact) o;
		return id == contact.id && Objects.equals(name, contact.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
// 3 - создаем Класс ContactTest и Метод  public void test1 (в отдельном классе), запускаем его и убеждаемся, что после сравнения по equals эти объекты - идентичные !
// Contact contact1 = new Contact(1, "Вася");
// Contact contact2 = new Contact(1, "Вася");
// 32108268
// 32108268
// true

}
