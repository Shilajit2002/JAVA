package LifeCycle;

class Stop extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Stop_Method {
    public static void main(String[] args) {
        Stop S=new Stop();
        S.start();
        S.stop();
    }
}
