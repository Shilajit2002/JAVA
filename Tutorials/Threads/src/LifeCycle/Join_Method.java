package LifeCycle;

class Join extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Join_Method {
    public static void main(String[] args) {
        Join J = new Join();
        Join J1 = new Join();

        J.start();
        try {
            J.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        J1.start();
    }
}
