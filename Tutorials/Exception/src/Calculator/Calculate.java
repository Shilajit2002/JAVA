package Calculator;

import java.util.Scanner;

public class Calculate {
    public void cal() {
        Addition A = new Addition();
        Subtraction S = new Subtraction();
        Multiplication M = new Multiplication();
        Division D = new Division();

        Scanner sc=new Scanner(System.in);

        int choice;
        long arr[]=new long[1000];
        do{
            System.out.print("1.Addition\n2.Multiplication\n3.Subtraction\n4.Division\n5.Off\nEnter your Choice :");
            choice=sc.nextInt();

            switch (choice){
                case 1->{
                    System.out.print("Enter Data : ");

                }
            }
        }while(choice!=5);
    }
}
