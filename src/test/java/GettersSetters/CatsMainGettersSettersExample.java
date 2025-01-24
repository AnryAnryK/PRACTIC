package GettersSetters;

public class CatsMainGettersSettersExample {

    public static void main(String[] args) {

        CatsGettersSettersExample barsik = new CatsGettersSettersExample("Барсик", 5, 4);
        String barsikName = barsik.getName();

        int barsikAge = barsik.getAge();
        int barsikWeight = barsik.getWeight();

        System.out.println("Имя кота: " + barsikName);
        System.out.println("Возраст кота: " + barsikAge);
        System.out.println("Вес кота: " + barsikWeight);

//        Результат:
//        Имя кота: Барсик
//        Возраст кота: 5
//        Вес кота: 4

        barsik.setName("Пушок"); // переназначил имя
        System.out.println("Новое Имя кота: " + barsikName);


//        Результат:
//        Имя кота: Пушок
//        Возраст кота: 5
//        Вес кота: 4



    }
}


