import java.util.*;

public class MD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr;
        int[][] arr1 = new int[5][];
        int[][] arr2 = {{1, 2, 5, 4},
                {7, 8, 5, 6},
                {10, 12, 20, 40}
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.print("\n");
        }

        // Array column initialization
        arr1[0] = new int[4];
        arr1[1] = new int[5];
        arr1[2] = new int[6];
        arr1[3] = new int[3];
        arr1[4] = new int[7];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.print("\n");
        }

        //  var a={1,2}; // Error
        var a = new int[6]; //    No Error
    }
}
