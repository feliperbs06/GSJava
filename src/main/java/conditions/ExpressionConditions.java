package conditions;

public class ExpressionConditions {
    public static void main(String[] args) {
        int x = 99;

        // "conditional operator" (aka "ternary operator")
        // parents here for readability :)
        // since always
        String message = (x == 99) ? "It's 99": "Not 99";
        System.out.println(message);

        // since Java 17
        String message2 = switch (x) {
            case 99 -> {
                System.out.println("hit the 99 in the switch");
                // yield needed in multi-line form
                yield "99, from the switch";
            }
            default -> "Something else from switch";
        };

        System.out.println(message2);
    }
}
