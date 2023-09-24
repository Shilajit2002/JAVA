public class StaticBlock {
    static int a = 5;
    static int b;

    //  Static Block
    static {
        System.out.println("Hello");
        b = 10 * a;
    }

    public static void print() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        // ** static block always execute first
        System.out.println("World");
        print();
    }
}
