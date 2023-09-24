public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // AND Logical Operator
        if (a && b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // OR Logical Operator
        if (a || b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // NOT Logical Operator
        System.out.println("NOT a = " + !a);
        System.out.println("NOT b = " + !b);
    }
}
