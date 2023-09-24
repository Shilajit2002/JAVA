package LifeCycle;

class Yield1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }
}

class Yield2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Yield_Method {
    public static void main(String[] args) {
        Yield1 Y=new Yield1();
        Y.start();
        Yield2 Y2=new Yield2();
        Y2.start();
    }
}
