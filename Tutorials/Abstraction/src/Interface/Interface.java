package Interface;

public class Interface {
    public static void main(String[] args) {

        //  Interface Class Object Creation

        /*
        Bicycle B = new Bicycle(); // Not Possible Show Error
        */

        /*
        Ranger R = new Ranger(); // Not Possible Show Error
        */

        //  Normal Class Object Creation
        AvonCycle A = new AvonCycle();
        A.ApplyBrake();
        A.SpeedUp();
        A.Bell();

        System.out.println("----------------------------------------------");

        //  Dynamic Method Dispatch

        Bicycle B = new AvonCycle();
        B.ApplyBrake();
        B.SpeedUp();
        /*
        B.Bell(); // Not Possible Show Error
        */

        /*
        AvonCycle AB = new Bicycle(); // Not Possible Show Error
        */

        /*
        Bicycle BA = new Ranger(); // Not Possible Show Error
         */

        /*
        Ranger R = new Bicycle(); // Not Possible Show Error
         */

        System.out.println("----------------------------------------------");

        X x = new X();
        x.Hello();
    }
}