public class Prime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = (int) Math.sqrt(n);
        boolean f = true;

        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                f = false;
                break;
            }
        }

        if (f) {
            System.out.println(n+" is a Prime Number");
        } else {
            System.out.println(n+" is Not a Prime Number");
        }
    }
}
