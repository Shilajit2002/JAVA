import java.util.Scanner;

class Temperature {
    //  Fahrenheit to Celsius
    public void FtoC(double F) {
        double C = ((F - 32) * 5) / 9;
        System.out.println("Celsius = " + C);
    }

    //  Celsius to Fahrenheit
    public void CtoF(double C) {
        double F = ((C * 9) / 5) + 32;
        System.out.println("Fahrenheit = " + F);
    }
}

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Temperature T = new Temperature();

        double F, C;
        int choice;

        System.out.print("1.Fahrenheit to Celsius\n2.Celsius to Fahrenheit\nEnter Your Choice : ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Fahrenheit : ");
            try {
                if (!sc.hasNextDouble()) {
                    throw new NumberFormatException();
                }
                F = sc.nextDouble();
                T.FtoC(F);
            } catch (NumberFormatException e) {
                System.out.println("Exception Occurred : " + e);
            }
        } else if (choice == 2) {
            System.out.print("Enter Celsius : ");
            try {
                if (!sc.hasNextDouble()) {
                    throw new NumberFormatException();
                }
                C = sc.nextDouble();
                T.CtoF(C);
            } catch (NumberFormatException e) {
                System.out.println("Exception Occurred : " + e);
            }
        } else {
            System.out.println("`~` Invalid Choice `~`");
        }
    }
}
