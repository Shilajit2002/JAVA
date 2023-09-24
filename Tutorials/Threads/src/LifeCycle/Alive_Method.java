package LifeCycle;

class Alive extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Alive_Method {
    public static void main(String[] args) {
        Alive A = new Alive();

        //  Before Starting Thread
        System.out.println("Before Starting A Thread is Alive : " + A.isAlive());

        A.start();
        //  After Starting Thread
        System.out.println("After Starting A Thread is Alive : " + A.isAlive());
    }
}
