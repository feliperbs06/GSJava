package many;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStuff {
    public static void showAll(List<String> names) {
        System.out.println("The names are");
        for (var n : names) {
            System.out.println("> " + n);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
//        LinkedList<String> names = new LinkedList<String>();
//        List<String> names = new LinkedList<String>();
        System.out.println("number of names is " + names.size());
        names.add("Fred");
        names.add("Jim");
        System.out.println("number of names is " + names.size());
        System.out.println("name contains " + names);
        System.out.println("is Fred in the list? " + names.contains("Fred"));
        System.out.println("is Albert in the list? " + names.contains("Albert"));
        names.remove("Fred");
        System.out.println("name contains " + names);
        names.add("Frederick");
        names.add("Sheila");

        for (String name: names) {
            System.out.println("I found name: " + name);
        }
        showAll(names);

    }
}
