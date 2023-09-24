class MyThr1 extends Thread {

    //  Constructor
    public MyThr1(String name) {
        super(name);
    }

    //  Run the Threads
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Thank you: " + this.getName());
            i++;
        }
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("T1 (Normal Priority)");
        MyThr1 t2 = new MyThr1("T2 (Minimum Priority)");
        MyThr1 t3 = new MyThr1("T3 (Minimum Priority)");
        MyThr1 t4 = new MyThr1("T4 (Minimum Priority)");
        MyThr1 t5 = new MyThr1("T5 (Maximum Priority)");

        //  Set the priority Max = High priority & Min = Low priority & Norm = Normal priority
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        //  Get Priority Method
        System.out.println("T1 Normal Priority = " + t1.getPriority());
        System.out.println("T2 Min Priority = " + t2.getPriority());
        System.out.println("T3 Min Priority = " + t3.getPriority());
        System.out.println("T4 Min Priority = " + t4.getPriority());
        System.out.println("T5 Max Priority = " + t5.getPriority());

        //  Start the Threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
