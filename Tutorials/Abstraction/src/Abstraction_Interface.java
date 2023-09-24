interface Parent{
    public void Meth1();
}

//  An Abstract Class Can Implements Interface
abstract class Child implements Parent {
    public abstract void Meth2();
}

abstract class Parent1{
    public abstract void Meth3();
}

//  An Interface Can not Extend Abstract Class
/*
interface Child1 extends Parent1{
    // Not Possible Show Error
}
*/

public class Abstraction_Interface {
    public static void main(String[] args) {
        /*
        Child C = new Child();

        Parent P = new Child();
                                        // All's Are Error
        Parent P1 = new Parent();

        Parent1 P11 = new Parent1();
         */
    }
}
