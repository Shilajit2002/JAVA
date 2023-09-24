class ThreadA extends Thread {
    public ThreadA() {
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadA i = " + i);
        }
    }
}

class ThreadB extends Thread {
    public ThreadB() {
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadB i = " + i);
        }
    }
}

class ThreadC extends Thread {
    public ThreadC() {
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadC i = " + i);
        }
    }
}

class PriorityHandler {
    public static void main(String[] args) {
        //	Thread A
        ThreadA a = new ThreadA();
        a.setPriority(Thread.MIN_PRIORITY);

        //	Thread B
        ThreadB b = new ThreadB();
        b.setPriority(Thread.MAX_PRIORITY);

        //	Thread C
        ThreadC c = new ThreadC();
        c.setPriority(Thread.NORM_PRIORITY);


        //	Get Priority
        System.out.println("Priority of ThreadA = " + a.getPriority());
        System.out.println("Priority of ThreadB = " + b.getPriority());
        System.out.println("Priority of ThreadC = " + c.getPriority());
    }
}