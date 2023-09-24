package Practice;

class Base{
    public Base() {
        System.out.println("I am Base Class");
    }
}

class Derived1 extends Base{
    public Derived1() {
        System.out.println("I am Derived 1 Class");
    }
}

class Derived2 extends Derived1{
    public Derived2() {
        System.out.println("I am Derived 2 Class");
    }
}

public class Constructors {
    public static void main(String[] args) {
        Derived2 obj = new Derived2();
    }
}
