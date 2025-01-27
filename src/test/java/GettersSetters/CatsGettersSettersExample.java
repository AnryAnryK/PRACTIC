package GettersSetters;

public class CatsGettersSettersExample {

    private String name;
    private int age;
    private int weight;

    public CatsGettersSettersExample(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public CatsGettersSettersExample() {
    }

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public String getName() {
        if (name == "Барсик") {
            System.out.println("Имя кота должно быть не " + name +", а Пушок = НеХорошо");
        } if (name == "Пушок") {
            System.out.println("Имя кота Пушок = Хорошо");
        }
        else {
            System.out.println("а где Пушок ?");
        }
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}


