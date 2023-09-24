class superclass{
    public String a="Hello";
    public static void pro(){
        System.out.println("Pro");
    }
}

class subclass extends superclass{
    public String a="Hello1";
    public static final void pro(){
        System.out.println("Pro1");
    }
}

public class Main {
    public static void main(String[] args) {
        superclass S = new superclass();
        superclass S1 = new subclass();

        System.out.println(S.a);
        System.out.println(S1.a);

        S.pro();
        S1.pro();
    }
}
