class Bracket {
    void display(String message) {
        System.out.print("[ " + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.print(" ]");
    }
}

class MyThread2 extends Thread {
    String S;
    Bracket B;

    public MyThread2(String S, Bracket B) {
        this.S = S;
        this.B = B;
        start();
    }

    @Override
    public void run() {
        //  synchronized statement
        synchronized (B) {
            B.display(S);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Bracket B = new Bracket();

        MyThread2 T1 = new MyThread2("Hello", B);
        MyThread2 T2 = new MyThread2("World", B);

        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}