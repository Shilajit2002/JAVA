package Parametric;

class Print<P, S> {
    P obj;
    S obj1;

    public Print(P obj, S obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }

    public P getObj() {
        return obj;
    }

    public void setObj(P obj) {
        this.obj = obj;
    }

    public S getObj1() {
        return obj1;
    }

    public void setObj1(S obj1) {
        this.obj1 = obj1;
    }
}

public class MultiGeneric {
    public static void main(String[] args) {
        Print<Integer, String> P = new Print<Integer, String>(8759, "Welcome to Generic");
        System.out.println("Integer = " + P.getObj());
        System.out.println("String = " + P.getObj1());
    }
}
