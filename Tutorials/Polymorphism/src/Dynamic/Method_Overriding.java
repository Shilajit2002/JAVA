package Dynamic;

class Hello {
    public void meth() {
        System.out.println("Hello");
    }
}

class World extends Hello {
    @Override
    public void meth() {
        System.out.println("World");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Hello h = new World();

        h.meth();
    }
}
