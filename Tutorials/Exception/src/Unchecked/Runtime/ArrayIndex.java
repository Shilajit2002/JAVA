package Unchecked.Runtime;

public class ArrayIndex {
    public static void main(String[] args) {
        int arr[] = new int[2];
        arr[0] = 1;
        try {
            arr[5] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
