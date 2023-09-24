package LifeCycle;

class Interrupt extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread is Running");
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread is Terminated");
        }
    }
}

public class Interrupt_Method {
    public static void main(String[] args) {
        Interrupt I = new Interrupt();
        I.start();

        System.out.println("Before Calling interrupt() Thread is Terminated : " + I.isInterrupted());


        //  Terminate the Thread when it is Blocked / Waiting State
        I.interrupt();

        System.out.println("After Calling interrupt() Thread is Terminated : " + I.isInterrupted());
    }
}
