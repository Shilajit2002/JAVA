package Polymorphism_Interfaces;

public class User {
    public static void main(String[] args) {
        SmartPhone S = new SmartPhone();

        //  CellPhone Class Method
        S.Call();
        S.SMS();

        System.out.println("---------------------------------");

        // GPS Interface Method
        S.Location();

        System.out.println("---------------------------------");

        //  Camera Interface Method
        S.Cam();

        System.out.println("---------------------------------");

        //  Media Player Interface Method
        S.Music();

        System.out.println("---------------------------------");

        //  SmartPhone Method
        S.Greet();
    }
}
