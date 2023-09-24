package LifeCycle;

class Suspend extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
                System.out.println(i + " : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Suspend_Resume {
    public static void main(String[] args) throws InterruptedException {
        Suspend S = new Suspend();
        Suspend S1 = new Suspend();
        Suspend S2 = new Suspend();
        S1.start();
        S.start();
        //  S Thread is blocked
        S.suspend();
        S2.start();
        //  S Thread Unblocked
//        S.resume();
    }
}
