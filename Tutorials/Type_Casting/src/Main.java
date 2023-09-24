public class Main {
    public static void main(String[] args) {
        float f = 3.5f;
        //  int a=f; (ERROR) // Implicit type cast not supported by Java
        int a = (int) f; //    Explicit type cast
        System.out.println(a);

        byte b = 10, d = 20;
        //  byte c=b+d; (ERROR) //  Implicit type cast not supported by Java
        byte c = (byte) (b + d); //    Explicit type cast
        System.out.println(c);

        int i = 10;
        double s = 3.5;
        double ans = i * s; //  Automatically Convert to Double
        System.out.println(ans);

        //  var q; //   (Error)
        var w = 10;
        var x = 3.5;
    }
}