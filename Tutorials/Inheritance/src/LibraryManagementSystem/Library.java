package LibraryManagementSystem;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User U = new User();

        int choice=0;

        do{
            System.out.print("1.Add Books\n2.Issue Book\n3.Return Book\n4.Exit\nEnter Your Choice : ");
            choice=sc.nextInt();

            switch (choice){
                case 1 -> {
                    //  Here sc.nextLine() is used for cleaning the input console buffer
                    sc.nextLine();

                    System.out.print("Enter Book Name = ");
                    U.AddBook(sc.nextLine());
                    U.Available();
                }
                case 2 -> {
                        //  Here sc.nextLine() is used for cleaning the input console buffer
                        sc.nextLine();

                        System.out.print("Enter Book Name for Issue = ");
                        if(U.IssueBook(sc.nextLine())){
                            System.out.println("Book is Issued");
                            System.out.println(U);
                        }
                        else {
                            System.out.println("This Book is Not Available");
                        }
                }
                case 3 -> {
                    //  Here sc.nextLine() is used for cleaning the input console buffer
                    sc.nextLine();

                    System.out.print("Enter Book Name for Return = ");
                    if(U.ReturnBook(sc.nextLine())){
                        System.out.println("Book is Returned");
                        System.out.println(U);
                    }
                    else {
                        System.out.println("This Book is Not Issued");
                    }
                }
                case 4 -> {
                    System.out.println("Exit....");
                }
                default -> {
                    System.out.println("~ Invalid Choice ~");
                }
            }
            System.out.println("--------------------------------------");
        }while (choice!=4);
    }
}
