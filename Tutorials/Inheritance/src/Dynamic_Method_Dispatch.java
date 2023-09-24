class Computer{
    //  Methods
    public void CPU(){
        System.out.println("Computer CPU");
    }

    public void Mouse(){
        System.out.println("Computer Mouse");
    }
}

class Laptop extends Computer{
    //  Methods
    public void Keyboard(){
        System.out.println("Laptop Keyboard");
    }

    @Override
    public void Mouse() {
        System.out.println("Laptop Mouse");
    }
}

public class Dynamic_Method_Dispatch {

    public static void main(String[] args) {

        //  Scenario 1
        //  Dynamic Method Dispatch
        Computer C = new Laptop();

        //  Laptop Mouse() will call
        C.Mouse();
        //  Computer CPU() will call
        C.CPU();

        //  Show Error because C is the Reference of Computer Class
        /*
        C.keyboard();
         */

        // Scenario 2
        //  Not Possible Show Error
        /*
        Laptop L = new Computer();
         */
    }
}
