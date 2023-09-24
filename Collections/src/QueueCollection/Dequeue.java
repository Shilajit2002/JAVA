package QueueCollection;

import java.util.ArrayDeque;

public class Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> A = new ArrayDeque<>();

        //  add Method
        System.out.println("----Added Elements----");
        for (int i = 0; i < 10; i++) {
            A.add(i);
        }
        A.add(5);

        //  ForEach
        System.out.println("----Get Elements----");
        for (Integer elem :
                A) {
            System.out.print(elem + ",");
        }

        System.out.println("\n----Add First Method----");
        //  Add the number at first position in the Queue
        A.addFirst(40);
        System.out.println(A);

        System.out.println("----Add Last Method----");
        //  Add the number at last position in the Queue
        A.addLast(100);
        System.out.println(A);

        System.out.println("----Get First Method----");
        //  get the number at first position in the Queue
        System.out.println(A.getFirst());

        System.out.println("----Get Last Method----");
        //  get the number at last position in the Queue
        System.out.println(A.getLast());

        System.out.println("----Remove First Method----");
        //  Remove the number at first position from the Queue
        A.removeFirst();
        System.out.println(A);

        System.out.println("----Remove Last Method----");
        //  Remove the number at last position from the Queue
        A.removeLast();
        System.out.println(A);

        System.out.println("----Contains Method----");
        System.out.println("Is A contains 5 ? => " + A.contains(5));

        System.out.println("----Remove Method----");
        //  Removes the element at the specified position in ArrayDeque
        A.remove(2);
        System.out.println(A);

        //  Creating Another ArrayDeque with initial capacity
        ArrayDeque<Integer> B = new ArrayDeque<>(5);

        for (int i = 0; i < 5; i++) {
            B.add(i * -5);
        }

        System.out.println("----Add All Method----");
        //  Add B ArrayDeque in A ArrayDeque
        A.addAll(B);
        System.out.println(A);

        System.out.println("----IsEmpty Method----");
        //  Check the ArrayDeque is empty or not
        System.out.println(A.isEmpty());

        System.out.println("----RemoveAll Method----");
        //  Remove B from A
        A.removeAll(B);
        System.out.println(A);

        System.out.println("----Clone Method----");
        //  Copy ArrayDeque of A in CloneArrayDeque
        ArrayDeque<Integer> CloneLinkedList = (ArrayDeque<Integer>) A.clone();
        System.out.println("Clone ArrayDeque is => " + CloneLinkedList);

        System.out.println("----Clear Method----");
        //  Clear the ArrayDeque
        A.clear();
        System.out.println(A);
    }
}
