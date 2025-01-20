package Interface;

public class Fish implements Swimmable{
	public void swim(){

	}

	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.swim();
		System.out.println("Рыбка - плавает");
	}
}
