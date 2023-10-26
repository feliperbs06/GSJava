package conditions;

public class SwitchCase {
    public static void main(String[] args) {
        int x = 99;
        // generally expression is of type int or smaller INTEGER TYPE
        // or String, or an enum type
        switch (x) {
            case 98:
            case 99:
                System.out.println("it's 98 or 99");
                System.out.println("Can have multiple statements and they just happen");
                break; // yikes, don't forget this!
            case 100:
                System.out.println("it's close to 100");
                break; // yikes, don't forget this!
            default:
                System.out.println("it's something else");
            case 101:
                System.out.println("don't fall through from default either!");
        }

        // newer Java (17 onwards)
        // if you can use this "arrow form" you SHOULD
        switch (x) {
            case 98, 99, 100 -> { // in arrow form, must use curlies for multiple statements...
                System.out.println("it's about 100");
                System.out.println("more code?");
            }
            default -> System.out.println("it's something else!");
        }

    }
}
