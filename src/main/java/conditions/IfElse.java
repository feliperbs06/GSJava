package conditions;

public class IfElse {
    public static void main(String[] args) {
        int x  = 10;

        // condition MUST be in parens
        // condition MUST be a boolean expression
        // No concept like "truthy/falsy"
        if (x > 50) {
            System.out.println("It's big!");
        } else if (x > 20) {
            System.out.println("medium sized");
        } else {
            System.out.println("smaller...");
        }
    }
}
