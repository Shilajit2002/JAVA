package Stack;

import java.util.Scanner;

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
                    try {
                        if (I.push(i)) {
                            System.out.println(i + " Pushed");
                        }
                    } catch (FullStackException e) {
                        System.out.println(e);
                    }

                }
                case 2 -> {
                    try {
                        if (I.pop()) {
                            System.out.println("Popped");
                        }
                    } catch (EmptyStackException e) {
                        System.out.println(e);
                    }

                }
                case 3 -> {
                    try {
                        System.out.println("Top of the Stack Element is : " + I.peek());
                    } catch (EmptyStackException e) {
                        System.out.println(e);
                    }

                }
                case 4 -> {
                    try {
                        System.out.println("** Stack **");
                        System.out.println(I);
                    } catch (EmptyStackException e) {
                        System.out.println(e);
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
