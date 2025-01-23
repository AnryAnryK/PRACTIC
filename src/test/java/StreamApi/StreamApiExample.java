package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamApiExample {
    public static void main(String[] args) {
        final List<String> list = List.of("one", "two", "three");

        list.stream()
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() <= 3;
                })
                .map(s1 -> {
                    System.out.println("map: " + s1);
                    return s1.toUpperCase();
                })
                .forEach(x -> {
                    System.out.println("forEach: " + x);
                });
        // получится такой результат (а не весь список сначала отфильтруется, затем преобразуется, а после этого будет выведен на консоль !!!),
        // т.е. это означает, что КАЖДЫЙ элемент потока проходит через весь пайплайн ОТДЕЛЬНО и поэтапно, а не применяются ко всей коллекции сразу и целиком !!:
//        filter: one
//        map: one
//        forEach: ONE
//        filter: two
//        map: two
//        forEach: TWO
//        filter: three
    }
}