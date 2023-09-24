class X{
    private int x;
    //  Default Constructor
    public X() {
        System.out.println("I am X Class (Parent Class)");
    }

    //  Parameterized Constructor
    public X(int x) {
        this.x = x;
    }
}

class Y extends X{
    private int y;
    //  Default Constructor
    public Y() {
        System.out.println("I am Y Class (Child Class)");
    }

    //  Parameterized Constructor
    public Y(int x, int y) {
        //  Constructor Call of X Class
        super(x);
        this.y = y;
    }
}

class Z extends Y{
    private int z;
    //  Default Constructor
    public Z() {
        System.out.println("I am Z Class (Grand Child Class)");
    }

    //  Parameterized Constructor
    public Z(int x, int y, int z) {
        //  Constructor Call of Y Class
        super(x, y);
        this.z = z;

        System.out.println("Total = "+(x+y+z));
    }
}

public class Inheritance_with_Constructor_Overloading {
    public static void main(String[] args) {

        //  Default Constructor will Work
        Z normal = new Z();
        System.out.println("------------------------------------------------");

        //  Parameterized Constructor will Work
        Z cal = new Z(10,20,30);
    }
}