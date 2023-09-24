//  It must need to be import corresponding packageName with Class name
import SingleClass.Single_Class_Package;

//  We can import Same packageName MultipleClass
/*
import MultipleClasses.A;
import MultipleClasses.B;
import MultipleClasses.C;
import MultipleClasses.D;
 */

//  Also we can implement using .*
//  i.e, its automatically imported all the Class Name file in corresponding package
import MultipleClasses.*;

public class PackageClass_Usage {
    public static void main(String[] args) {
        // SingleClass Package
        Single_Class_Package S = new Single_Class_Package();
        System.out.println("It Creates the SingleClass Package Single_Class_Package Class Object");

        //  MultipleClass Package
        A a = new A();
        System.out.println("It Creates the MultipleClasses Package A Class Object");
        B b = new B();
        System.out.println("It Creates the MultipleClasses Package B Class Object");
        C c = new C();
        System.out.println("It Creates the MultipleClasses Package C Class Object");
        D d = new D();
        System.out.println("It Creates the MultipleClasses Package D Class Object");
    }
}
