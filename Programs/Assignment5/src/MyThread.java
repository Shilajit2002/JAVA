public class MyThread extends Thread {
    public MyThread() {
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread Class i = " + i);
        }
    }
}

class Driver {
    public static void main(String[] args) {
        new MyThread();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Class i = " + i);
        }
    }
}