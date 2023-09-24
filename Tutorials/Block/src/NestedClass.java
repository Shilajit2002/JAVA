class Outer {
    int a;

    class Inner {
        int b;

        void print() {
            System.out.println("a = " + a); //  Inner Class can access directly members of Outer Class
            System.out.println("b = " + b);
        }
    }

    static class Inner1 {
        int b;

        void print() {
            //  System.out.println("a = " + a); //  Error Because Inner1 is Static
            System.out.println("b = " + b);
        }
    }

    void show() {
        System.out.println("a = " + a);
        //  System.out.println("b = " + b); //  Error - Because Outer Class need object to access the member of inner class
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.a = 10;
        out.show();

        // Outer.Inner in=new Outer.Inner(); //  Error

        Outer.Inner1 in = new Outer.Inner1();
        in.b = 20;
        in.print();
    }
}
