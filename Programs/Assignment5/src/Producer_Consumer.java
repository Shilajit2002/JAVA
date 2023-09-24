class Q {
    int n;
    boolean busy = false;

    synchronized int get() {
        //	When busy is true
        if (!busy) {
            try {
                //  Its blocks the Consumer Thread
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Get " + n);
        busy = false;
        //  Its unblocked the current blocked thread
        notify();
        return n;
    }

    synchronized void put(int n) {
        //	When busy is true
        if (busy) {
            try {
                //  Its blocks the Producer Thread
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        this.n = n;
        busy = true;
        System.out.println("Put " + n);
        //  Its unblocked the current blocked thread
        notify();
    }
}

class Producer extends Thread {
    Q q;

    Producer(Q q) {
        this.q = q;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            q.put(i);
        }
    }
}

class Consumer extends Thread {
    Q q;

    Consumer(Q q) {
        this.q = q;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            q.get();
        }
    }
}

class InterThread {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}