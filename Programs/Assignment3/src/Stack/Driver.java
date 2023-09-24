package Stack;

import java.util.*;

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> I = new Stack<Integer>();

        int choice;

        do {
            System.out.print("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit\nEnter your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Element : ");
                    int i = sc.nextInt();
                    if (I.push(i)) {
                        System.out.println(i + " Pushed");
                    }
                }
                case 2 -> {
                    if (I.pop()) {
                        System.out.println("Popped");
                    } else {
                        System.out.println("Stack Underflow");
                    }
                }
                case 3 -> {
                    if (I.peek() != null) {
                        System.out.println("Top of the Stack Element is : " + I.peek());
                    } else {
                        System.out.println("Stack Underflow");
                    }
                }
                case 4 -> {
                    if (Objects.equals(I.toString(), "\0")) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println("** Stack **");
                        System.out.println(I);
                    }
                }
                case 5 -> {
                    System.out.println("Quiting...");
                }
                default -> System.out.println("Invalid Choice");
            }
            System.out.println("------------------------------------");
        } while (choice != 5);

    }
}
