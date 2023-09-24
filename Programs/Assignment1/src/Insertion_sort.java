import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, key, j;
        System.out.print("Enter the total no. of Elements = ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements in the Array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting Technique
        for (int i = 1; i < n; i++) {
            key = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }

        System.out.println("Sorted Array is :");
        for (int l : arr) {
            System.out.print(l + " ");
        }
    }
}
