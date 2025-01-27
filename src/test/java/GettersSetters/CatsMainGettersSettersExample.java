package GettersSetters;

public class CatsMainGettersSettersExample {

    public static void main(String[] args) {

        CatsGettersSettersExample barsik = new CatsGettersSettersExample("Барсик", 5, 4);
        String barsikName = barsik.getName();


        Cats cats = new Cats();
        System.out.println("здесь выводится имя из 9 строки String name = 'Tom'; из класса public class Cats : " + cats.name);


        cats.name = "Колбаскин";
        System.out.println("здесь переопределяется имя с 'Tom' на 'Колбаскин' : "+cats.name);

    //

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
        System.out.println("Новое Имя кота через .getName равно Пушок = " + barsik.getName());


//        Результат:
//        Новое Имя кота через .getName: Пушок



    }
}


