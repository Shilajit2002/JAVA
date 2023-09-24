package SamePackage;

public class SameClass_SamePackage{
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public void meth(){
        System.out.println("SameClass SamePackage\n---------------------");

        //  All Access Modifiers are Accessible in SameClass & SamePackage
        System.out.println("Public = "+a);
        System.out.println("Private = "+b);
        System.out.println("Protected = "+c);
        System.out.println("Default = "+d);
    }
}

class SubCLass_SamePackage extends SameClass_SamePackage{
    public void meth(){
        System.out.println("---------------------\nSubCLass SamePackage\n---------------------");

        //  Private Access Modifier is Not Accessible in SubClass & SamePackage
        System.out.println("Public = "+super.a);
        // System.out.println("Private = "+b); // Not Possible Show Error
        System.out.println("Protected = "+super.c);
        System.out.println("Default = "+super.d);
    }
}

class OtherClass_SamePackage{
    public void meth(){
        //  Create Object of the SameClass_SamePackage Class
        SameClass_SamePackage SCSP = new SameClass_SamePackage();

        System.out.println("---------------------\nOtherCLass SamePackage\n---------------------");

        //  Private Access Modifier is Not Accessible in OtherClass & SamePackage
        System.out.println("Public = "+SCSP.a);
        // System.out.println("Private = "+SCSP.b); // Not Possible Show Error
        System.out.println("Protected = "+SCSP.c);
        System.out.println("Default = "+SCSP.d);
    }
}


class Driver {
    public static void main(String[] args) {
        SameClass_SamePackage Same = new SameClass_SamePackage();
        SubCLass_SamePackage Sub = new SubCLass_SamePackage();
        OtherClass_SamePackage Other = new OtherClass_SamePackage();

        Same.meth();
        Sub.meth();
        Other.meth();
    }
}
