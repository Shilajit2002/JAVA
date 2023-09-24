package Parametric;

class Test<T> {
    T obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

public class Generic {
    public static void main(String[] args) {
        Test<Integer> T = new Test<Integer>(143);
        System.out.println("Integer = " + T.getObj());

        Test<String> T1 = new Test<String>("Hello World");
        System.out.println("String = " + T1.getObj());
    }
}
