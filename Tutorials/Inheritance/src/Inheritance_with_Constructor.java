class Phone{
    //  Constructor
    public Phone() {
        System.out.println("I am Phone Constructor");
    }
}

class SmartPhone extends Phone{
    //  Constructor
    public SmartPhone() {
        System.out.println("I am Smart Phone Constructor");
    }
}

public class Inheritance_with_Constructor {
    public static void main(String[] args) {
        //  Create a SmartPhone Object
        SmartPhone S=new SmartPhone();

        //  The Default Constructor of the Parent Class is Executed First
        //  After that Child Class Constructor will Execute
    }
}