import java.util.*;

public class one_darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaration
        int[] arr;
        // Allocation
        arr = new int[5];

        // Initialization
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Declaration + Allocation
        int[] arr1 = new int[5];

        // Initialization
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // Declaration + Initialization
        int[] arr2 = { 50, 100, 42, 70, 12, 98, 200, 10 };
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        // Quick Quiz
        int[] reverse = new int[10];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = sc.nextInt();
        }
        for (int i = reverse.length - 1; i >= 0; i--) {
            System.out.print(reverse[i] + " ");
        }

        // For Each Loop
        int a[]={45,21,87,63,98,100};
        for (int i : a) {
            System.out.println(i);
        }
        
    }
}
