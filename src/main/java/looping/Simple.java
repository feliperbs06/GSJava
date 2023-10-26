package looping;

public class Simple {
    public static void main(String[] args) {
        int x  = 3;
        while (x > 0) {
            System.out.println("x is " + x);
//            x = x - 1;
//            x -= 1;
            x--; // ++x x++ --x also...
        }

        System.out.println("------------------");
        for (int y = 3; y >0; y--) {
            System.out.println("y is " + y);
        }

        System.out.println("------------------");

        int y = 0;
        do {
            System.out.println("value of y is " + y);
        } while (y > 0);


    }
}
