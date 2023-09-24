package Practice;

class State extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}

class Demo {
    public static void main(String[] args) {
        State S = new State();
        S.setPriority(7);
        System.out.println(S.getPriority());
        System.out.println(S.getState());

        S.start();
        System.out.println(S.getState());
        System.out.println(Thread.currentThread().getState());
    }
}