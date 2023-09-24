import java.io.BufferedWriter;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
        System.out.println("--------Question 1--------");
        float[] arr = new float[5];
        System.out.println("Enter elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
        }
        float sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.println("Sum is = " + sum);

        // Question 2
        System.out.println("--------Question 2--------");
        int n;
        System.out.print("Enter no. = ");
        n = sc.nextInt();
        boolean a = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                a = true;
                break;
            }
        }
        if (a) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }

        // Question 3
        System.out.println("--------Question 3--------");
        float[] marks = { 98.4f, 54.2f, 78.6f, 90.78f, 100 };
        float sum1 = 0;
        for (float f : marks) {
            sum1 += f;
        }
        System.out.println("Average Marks = " + (sum1 / marks.length));

        // Question 4
        System.out.println("--------Question 4--------");
        int[][] matrix = new int[2][3];
        int[][] matrix1 = new int[2][3];
        int[][] add = new int[2][3];
        System.out.println("Enter numbers in Matrix1 : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter numbers in Matrix2 : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                add[i][j] = matrix[i][j] + matrix1[i][j];
            }
        }

        System.out.println("Addition of two Matrix :");
        for (int i = 0; i < add.length; i++) {
            for (int j = 0; j < add[i].length; j++) {
                System.out.print(add[i][j] + "\t");
            }
            System.out.print("\n");
        }

        // Question 6,7
        System.out.println("--------Question 6,7--------");
        float max, min;
        max = min = arr[0];
        for (float i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Max = " + max + " Min = " + min);

        // Question 8
        System.out.println("--------Question 8--------");
        int n1;
        System.out.print("Enter no of elements = ");
        n1 = sc.nextInt();
        System.out.println("Enter the elements = ");
        int[] sort = new int[n1];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < sort.length - 1; i++) {
            if (sort[i] > sort[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
