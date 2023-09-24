package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();

        //  add Method
        System.out.println("----Added Elements----");
        for (int i = 0; i < 10; i++) {
            A.add(i);
        }
        A.add(5);

        //  get Method
        System.out.println("----Get Elements----");
        for (int i = 0; i < A.size(); i++) {
            System.out.print(A.get(i) + ",");
        }

        System.out.println("\n----Added 20 at 3rd Position----");
        //  add Method with specific position
        A.add(2, 20);
        System.out.println(A);

        System.out.println("----Set 50 at 3rd Position----");
        //  set Method for setting a value at specific position by removing the past value
        A.set(2, 50);
        System.out.println(A);

        System.out.println("----Contains Method----");
        System.out.println("Is A contains 5 ? => " + A.contains(5));

        System.out.println("----IndexOf Method----");
        System.out.println("First Index of 5 is => " + A.indexOf(5));
        //  70 is not present so it returns -1
        System.out.println("First Index of 70 is => " + A.indexOf(70));

        System.out.println("----LastIndexOf Method----");
        System.out.println("Last Index of 5 is => " + A.lastIndexOf(5));
        //  70 is not present so it returns -1
        System.out.println("Last Index of 70 is => " + A.lastIndexOf(70));

        System.out.println("----Remove Method----");
        //  Removes the element at the specified position in this list
        A.remove(2);
        System.out.println(A);

        //  Creating Another ArrayList with initial capacity
        ArrayList<Integer> B = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            B.add(i * -5);
        }

        System.out.println("----Add All Method----");
        //  Add B ArrayList in A ArrayList
        A.addAll(B);
        System.out.println(A);

        System.out.println("----Sort Method----");
        Collections.sort(A);
        System.out.println(A);

        System.out.println("----IsEmpty Method----");
        //  Check the ArrayList is empty or not
        System.out.println(A.isEmpty());

        System.out.println("----RemoveAll Method----");
        //  Remove B from A
        A.removeAll(B);
        System.out.println(A);

        System.out.println("----Clone Method----");
        //  Copy ArrayList of A in CloneArrayList
        ArrayList<Integer> CloneArrayList = (ArrayList<Integer>) A.clone();
        System.out.println("Clone ArrayList is => " + CloneArrayList);

        System.out.println("----Clear Method----");
        //  Clear the ArrayList
        A.clear();
        System.out.println(A);
    }
}
