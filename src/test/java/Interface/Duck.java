package Interface;

import org.junit.jupiter.api.Test;

public class Duck implements Swimmable {

	public void swim() {
	}

	public static void main(String[] args) {

		Duck duck = new Duck();
		duck.swim();
		System.out.println("Уточка - плавает");
	}
}
