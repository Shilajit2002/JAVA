package LinkedListCollection;

import java.util.LinkedList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> A = new LinkedList<>();

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

        System.out.println("----Add First Method----");
        //  Add the number at first position in the LinkedList
        A.addFirst(40);
        System.out.println(A);

        System.out.println("----Add Last Method----");
        //  Add the number at last position in the LinkedList
        A.addLast(100);
        System.out.println(A);

        System.out.println("----Get First Method----");
        //  get the number at first position in the LinkedList
        System.out.println(A.getFirst());

        System.out.println("----Get Last Method----");
        //  get the number at last position in the LinkedList
        System.out.println(A.getLast());

        System.out.println("----Remove First Method----");
        //  Remove the number at first position from the LinkedList
        A.removeFirst();
        System.out.println(A);

        System.out.println("----Remove Last Method----");
        //  Remove the number at last position from the LinkedList
        A.removeLast();
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

        //  Creating Another LinkedList (no initial capacity)
        LinkedList<Integer> B = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            B.add(i * -5);
        }

        System.out.println("----Add All Method----");
        //  Add B LinkedList in A LinkedList
        A.addAll(B);
        System.out.println(A);

        System.out.println("----Sort Method----");
        Collections.sort(A);
        System.out.println(A);

        System.out.println("----IsEmpty Method----");
        //  Check the LinkedList is empty or not
        System.out.println(A.isEmpty());

        System.out.println("----RemoveAll Method----");
        //  Remove B from A
        A.removeAll(B);
        System.out.println(A);

        System.out.println("----Clone Method----");
        //  Copy LinkedList of A in CloneLinkedList
        LinkedList<Integer> CloneLinkedList = (LinkedList<Integer>) A.clone();
        System.out.println("Clone LinkedList is => " + CloneLinkedList);

        System.out.println("----Clear Method----");
        //  Clear the LinkedList
        A.clear();
        System.out.println(A);
    }
}
