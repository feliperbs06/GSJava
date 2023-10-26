package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example {
    public static void showAll(List<String> ls) {
        for (var s : ls) {
            System.out.println("> " + s);
        }
    }

    // java.util.function.Predicate
    public static List<String> getLong(List<String> ls, Predicate<String> crit) {
        List<String> res = new ArrayList<>();
        for (var s: ls) {
            if (crit.test(s)) {
                res.add(s);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> names = List.of("Fred", "Jim", "Sheila");

        showAll(names);
        System.out.println("-------------");
//        showAll(getLong(names));
        showAll(getLong(names,
//                (String s) -> {return s.length() > 3;}
//                s -> {return s.length() > 3;}
                s -> s.length() > 3
        ));
        System.out.println("-------------");
    }
}
