class Bullet implements Runnable {
    public Bullet() {
        Thread T = new Thread(this);
        T.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " Bullet is Running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class GUN {
    public static void main(String[] args) {
        new Bullet();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " Gun is Reloading...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}