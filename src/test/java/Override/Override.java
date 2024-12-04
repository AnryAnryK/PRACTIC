package Override;

public class Override {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		System.out.println(parent.method());
		System.out.println(child.method());
	}
}

class Parent {
	String method() {
		return "Родительский метод";
	}
}


class Child extends Parent {
	@java.lang.Override
	String method() {
		return "Переопределенный Родительский метод в Дочерний класс";
	}
}

