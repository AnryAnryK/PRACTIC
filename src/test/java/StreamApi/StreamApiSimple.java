package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamApiSimple {
    public static void main(String[] args) {
        List<String> stream1 = new ArrayList<String>();
        stream1.add("123");
        stream1.add("aaa");
        stream1.add("123aaa123");

        stream1.stream()
                .filter(val -> val.equals("aaa")).map(String::toUpperCase) //преобразование в ВЕРХНИЙ РЕГИСТР
                .forEach(val -> System.out.println(val));
    }
}