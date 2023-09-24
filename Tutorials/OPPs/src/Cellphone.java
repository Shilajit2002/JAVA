//  Question 2

import java.util.Scanner;

public class Cellphone {
    //  Calling Method
    public void call(){
        System.out.println("Calling...");
    }

    //  Ring Method
    public void ring(){
        System.out.println("Ringing...");
    }

    //  Vibrate Method
    public void vibrate(){
        System.out.println("Vibrating...");
    }

    //  Receive Method
    public void receive(){
        System.out.println("Receiving...");
    }

    //  Talking Method
    public void talk(){
        System.out.println("Talking...");
    }

    //  End Call Method
    public void end(){
        System.out.println("End Call");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Are you want to call , y/n : ");
        String a=sc.nextLine();

        if (a.equalsIgnoreCase("y")) {
                Cellphone C=new Cellphone();
                C.call();
                C.ring();
                C.vibrate();
                C.receive();
                C.talk();
                C.end();
        }
        else if(a.equalsIgnoreCase("n")){
            System.out.println("`~` OK `~`");
        }
        else{
            System.out.println("Wrong Choice");
        }
    }
}
