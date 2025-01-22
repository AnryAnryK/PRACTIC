import org.junit.jupiter.api.Test;

public class DuckSwim implements Swimmable {

    public void swim() {

//        DuckSwim duck = new DuckSwim();
//        duck.swim();
//    System.out.println("Уточка плавает");   // такая реализация ошибку java.lang.StackOverflowError (бесконечный цикл)
    }


    public static void main(String[] args) {
        DuckSwim duck = new DuckSwim();
        duck.swim();
        System.out.println("Уточка плавает");  // такая реализация прекрасно отрабатывает
    }
}
