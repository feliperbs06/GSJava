package methods;

public class Examples {

    public static String monthName(int month) {
        String [] names = {"January", "February"};
        return names[month - 1];
    }

    public static int add(int a) {
        return add(a, 2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

//    public static void showAll(String [] names) {
    public static void showAll(String ... names) {
        System.out.println("names are: ");
        for (String n : names) {
            System.out.println("> " + n);
        }
    }

    public static void main(String[] args) {
        System.out.println("1 + 2 is " + add(1, 2));
        // DO NOT HAVE:
        // named argument passing
        // default values

        // method overloading
        System.out.println("1 + 2 is " + add(1));

        System.out.println("names are: ");
//        showAll(new String[]{
//            "Fred", "Jim", "Sheila"
//        });
        showAll("Fred", "Jim", "Sheila");

        System.out.println("Month 1 is called " + monthName(1));
        System.out.println("Month 1 is called " + monthName(-1));
    }
}
