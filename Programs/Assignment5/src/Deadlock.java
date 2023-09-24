//  Lock String Class
class LockString {
    public String LS() {
        return "Locked String Class";
    }
}

//  Lock Integer Class
class LockInteger {
    public String LI() {
        return "Locked Integer Class";
    }
}

class Deadlock {
    LockString LS;
    LockInteger LI;

    //	Method1
    public void meth1(LockInteger LI, LockString LS) {
        this.LI = LI;
        this.LS = LS;

        synchronized (LS) {
            //  Its Lock the String Class
            System.out.println("Method1 " + LS.LS());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Method1 try to Lock Integer Class");

            //  Its try to Lock the Integer Class
            synchronized (LI) {
                System.out.println("Method1 " + LI.LI());
            }
        }
    }

    //	Method2
    public void meth2(LockInteger LI, LockString LS) {
        this.LI = LI;
        this.LS = LS;

        synchronized (LI) {
            //  Its Lock the Integer Class
            System.out.println("Method2 " + LI.LI());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Method2 try to Lock String Class");

            //  Its try to Lock the String Class
            synchronized (LS) {
                System.out.println("Method2 " + LS.LS());
            }
        }
    }
}

class Lock {
    public static void main(String[] args) {
        LockInteger LI = new LockInteger();
        LockString LS = new LockString();
        Deadlock D = new Deadlock();

        //	Thread 1
        Thread a = new Thread() {
            @Override
            public void run() {
                D.meth1(LI, LS);
            }
        };
        a.start();

        //	Thread 2
        Thread b = new Thread() {
            @Override
            public void run() {
                D.meth2(LI, LS);
            }
        };
        b.start();
    }
}