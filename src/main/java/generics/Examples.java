package generics;

import java.time.LocalDate;
import java.util.ArrayList;

public class Examples {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Fred");
        al.add(LocalDate.now());
        System.out.println(al);

//        Object name = al.get(0);
        String name = (String) al.get(0);
        System.out.println(name.length());
    }
}
