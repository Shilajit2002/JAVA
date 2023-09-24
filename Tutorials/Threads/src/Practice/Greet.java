package Practice;

class GdM extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class WeC extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                sleep(200);
                System.out.println("Welcome");

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Greet {
    public static void main(String[] args) {
        GdM G = new GdM();
        WeC W = new WeC();

        G.start();
        W.start();

        System.out.println(G.getPriority());
        System.out.println(W.getPriority());
    }
}
