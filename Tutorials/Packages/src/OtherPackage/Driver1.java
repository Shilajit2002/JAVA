package OtherPackage;

import SamePackage.SameClass_SamePackage;

class SubClass_OtherPackage extends SameClass_SamePackage{
    public void meth(){
        System.out.println("SubCLass OtherPackage\n---------------------");

        //  Private & Default Access Modifier is Not Accessible in SubClass & OtherPackage
        System.out.println("Public = "+super.a);
        // System.out.println("Private = "+super.b); // Not Possible Show Error
        System.out.println("Protected = "+super.c);
        // System.out.println("Default = "+super.d); // Not Possible Show Error
    }
}

class OtherClass_OtherPackage{
    public void meth(){
        //  Create Object of the SameClass_SamePackage Class
        SameClass_SamePackage SCSP = new SameClass_SamePackage();

        System.out.println("---------------------\nOtherCLass OtherPackage\n---------------------");

        //  Private & Protected & Default Access Modifier is Not Accessible in OtherClass & OtherPackage
        System.out.println("Public = "+SCSP.a);
        // System.out.println("Private = "+SCSP.b); // Not Possible Show Error
        // System.out.println("Protected = "+SCSP.c); // Not Possible Show Error
        // System.out.println("Default = "+SCSP.d); // Not Possible Show Error
    }
}

public class Driver1 {
    public static void main(String[] args) {
        SubClass_OtherPackage Sub = new SubClass_OtherPackage();
        OtherClass_OtherPackage Other = new OtherClass_OtherPackage();

        Sub.meth();
        Other.meth();
    }
}
