class MyThreadRunnable1 implements Runnable{

    //  Override the Run Method with Implementation
    @Override
    public void run() {
        int i = 0;
        while (i<100000) {
            System.out.println("Gun1 is Shooting");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{

    //  Override the Run Method with Implementation
    @Override
    public void run() {
        int i = 0;
        while (i<100000) {
            System.out.println("Gun2 is Shooting");
            i++;
        }
    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();

        //  Create Thread Object and Put the Runnable Interface Object
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
