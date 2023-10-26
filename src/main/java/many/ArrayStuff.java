package many;

import java.util.Arrays;

public class ArrayStuff {
    public static void main(String[] args) {
        String [] names; // arrays are objects, we must build one
        names = new String[3];
        System.out.println("names[0] is " + names[0]);
        names[0] = "Fred";
        names[1] = "Jim";

        System.out.println(names);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

        // arrays size is FIXED at creation -- probably avoid them

        // literal initialization
//        String [] moreNames = new String[] {
//                "Alex", "Bob", "Sally"
//        };
        String [] moreNames = {
                "Alex", "Bob", "Sally"
        };
        System.out.println(Arrays.toString(moreNames));

        for (var s : moreNames) {
            System.out.println("> " + s);
        }

        // check out "System.arraycopy" if you ever need to
        // resize an array (make a new one and copy!), or copy the contents



    }
}
