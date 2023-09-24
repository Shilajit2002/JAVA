public class ArrayException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(arr[i]);
                total += arr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        System.out.println("Total of all Array Elements = " + total);
    }
}
