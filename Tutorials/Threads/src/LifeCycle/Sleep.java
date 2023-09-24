package LifeCycle;

class Sleep extends Thread {
    //  Constructor
    public Sleep() {
        //  Sleep Thread Start its own Thread Process
        start();
    }

    //  Run Method
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Sleep Thread is Running");
            //  Sleep() the Thread1
            //  Sleep() throws an Interrupted Exception
            try {
                //  It's Sleep for 1000ms
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            i++;
        }
        System.out.println("---------------------Sleep Thread is End---------------------");
    }
}

class SleepRun {
    public static void main(String[] args) {
        //  Sleep Object Create
        new Sleep();    //  It's call the own constructor and start also
    }
}
