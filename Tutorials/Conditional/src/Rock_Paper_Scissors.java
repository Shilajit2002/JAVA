import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Name : ");
        String player = sc.next();

        System.out.print("Enter 0 for Rock , 1 for Paper , 2 for Scissor : ");
        int User_inp = sc.nextInt();

        if (User_inp == 0) {
            System.out.println(player + " Choice : Rock");
        } else if (User_inp == 1) {
            System.out.println(player + " Choice : Paper");
        } else if (User_inp == 2) {
            System.out.println(player + " Choice : Scissor");
        } else {
            System.out.println("Wrong Choice");
        }

        Random random = new Random();
        int Com_inp = random.nextInt(3);

        if (Com_inp == 0) {
            System.out.println("Computer Choice : Rock");
        } else if (Com_inp == 1) {
            System.out.println("Computer Choice : Paper");
        } else {
            System.out.println("Computer Choice : Scissor");
        }

        if (User_inp == Com_inp) {
            System.out.println("-- Draw Match --");
        } else if ((User_inp == 0 && Com_inp == 2) || (User_inp == 1 && Com_inp == 0)
                || (User_inp == 2 && Com_inp == 1)) {
            System.out.println("** "+player+" Win **");
        } else {
            System.out.println("`~` Computer Win `~`");
        }
    }
}