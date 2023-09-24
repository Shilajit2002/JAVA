public class Bitwise {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println("2 & 3 = " + (a & b));
        System.out.println("2 | 3 = " + (a | b));
        System.out.println("2 ^ 3 = " + (a ^ b));
        System.out.println("~2 = " + (~a) + ", ~3 = " + (~b));

        //  Left Shift
        System.out.println("2<<1 = " + (a << 1));
        System.out.println("3<<1 = " + (b << 1));

        //  Right Shift
        System.out.println("2>>1 = " + (a >> 1));
        System.out.println("3>>1 = " + (b >> 1));

        //  Right Shift 0 Filled
        System.out.println("8>>>1 = " + (8 >>> 1));
        System.out.println("10>>>1 = " + (10 >>> 1));
    }
}
