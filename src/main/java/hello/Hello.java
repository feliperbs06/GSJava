package hello;

//import java.lang.System;
//import static java.lang.System.out;

public class Hello {
    public static void main(String[] args) {
//        java.lang.System.out.println("Hello World!");
        System.out.println("Hello World!");
//        out.println("Hello World!");

//        String name;
//        name = "Felipe";
        String name = "Felipe";
//        var name = "Felipe";
//        name  = 99; // Strong static typing, can't cheat this!
        int x = 99; // 99 is a LITERAL INT

        // boolean -- true false
        // byte short  -- use for large arrays of small numbers
        // char 16 bit unicode
        // int -- 32 bit
        // long -- 64 int
        // float -- 32 bit float
        // double -- 64 bit float (IEEE 754)

        // widening conversions OK (but not narrowing in general)

        short s1 = 16;
        int y = s1; // widening conversion
//        s1 = y; // narrowing, prohibited
        s1 = (short) y; // "cast" aka "trust me, I'm an engineer!"

        // operators:
        // arithmetic: + - * / %
        // division is integer or float depending on operands
        // results of arithmetic (all) is at least int, and
        // otherwise, larger of the types
        // % is REMAINDER, not MOD

        // comparison: < <= > >= == !=
        // boolean && (and), || {or} -- both "short circuit", ! (negation)
        // bitwise &, |, ^ (xor), ~ (bit negation)

        String name2 = "Fel";
        // plus concatenates Strings
        // AND with one String argument, the other can be ANYTHING
        // and will convert automatically
        // Strings are IMMUTABLE, operations like below
        // create NEW strings not change the old one.

        name2 = name2 + "ipe";
        System.out.println("name 2 is " + name2);
        System.out.println("name == name2 ? "+ (name == name2));
        System.out.println("name.equals(name2) ? "+ (name.equals(name2)));

        StringBuilder sb1 = new StringBuilder("Fred");
        StringBuilder sb2 = new StringBuilder("Fred");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
    }
}
