package Abstract;

public class Abstract {
    public static void main(String[] args) {

        //  Abstract Class Object Creation

        /*
        PhoneModel P = new PhoneModel(); // Not Possible Show Error
         */

        /*
        Android A = new Android(); // Not Possible Show Error
         */

        //  Normal Class Object Creation
        IPhone I = new IPhone();
        I.Call();
        I.Hello();
        I.Game();
        I.Run();

        System.out.println("----------------------------------------------");

        //  Dynamic Method Dispatch

        PhoneModel P = new IPhone();
        P.Call();
        P.Hello();
        P.Game();
        /*
        P.Run(); // Not Possible Show Error
        */

        /*
        IPhone IA = new PhoneModel(); // Not Possible Show Error
        */

        /*
        PhoneModel PA = new Android(); // Not Possible Show Error
        */

        /*
        Android Abstract.A = new PhoneModel(); // Not Possible Show Error
        */

        System.out.println("----------------------------------------------");

        /*
        A a = new B(); // Not Possible Show Error
         */

        /*
        B b = new B(); // Not Possible Show Error
         */

        A a = new A();
        a.Morning();
    }
}
