public class Average {
    static double Avg(int... arr) {
        int sum = 0;
        for (int a :
                arr) {
            sum += a;
        }
        return ((double) sum / arr.length);
    }

    public static void main(String[] args) {
        System.out.println("Average = " + Avg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
