package LinkedList;

import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice, data, rem, s;

        LinkedList L = new LinkedList();

        do {
            System.out.print("1.Insert\n2.Remove\n3.Search\n4.Display\n5.Exit\nEnter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Data : ");
                    data = sc.nextInt();

                    L.insertData(data);
                }

                case 2 -> {
                    System.out.print("Enter Data for Remove : ");
                    rem = sc.nextInt();
                    if (L.removeData(rem)) {
                        System.out.println(rem + " is Removed from the List");
                    } else {
                        System.out.println(rem + " is not in the List");
                    }
                }

                case 3 -> {
                    System.out.print("Enter Data for Search : ");
                    s = sc.nextInt();
                    if (L.search(s)) {
                        System.out.println(s + " is Found in the List");
                    } else {
                        System.out.println(s + " is not Found in the List");
                    }
                }

                case 4 -> L.display();

                case 5 -> System.out.println("Quiting...");

                default -> System.out.println("Invalid Choice");
            }
            System.out.println("--------------------------------------");
        } while (choice != 5);
    }
}
