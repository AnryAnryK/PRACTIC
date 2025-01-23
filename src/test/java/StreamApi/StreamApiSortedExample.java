package StreamApi;

import java.util.List;

public class StreamApiSortedExample {
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
                .sorted()
                .forEach(x -> {
                    System.out.println("forEach: " + x);
                });
        // получится такой результат:

//        filter: one
//        map: one
//        filter: two
//        map: two
//        filter: three
//        forEach: ONE
//        forEach: TWO
    }
}