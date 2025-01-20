package AbstractClass;

import org.junit.jupiter.api.Test;

public class Sedan extends CarAbstract {

	@Override
	public void gas() {
		System.out.println("Седан едет");
	}

	@Override
	public void brake() {

	}

	public static void main(String[] args) {
		Car car = new Car();
		car.brake();  // реализуется метод из 13 строки (public  void brake()) класса public class Car
			}
}
