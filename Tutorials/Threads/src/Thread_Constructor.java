class Car extends Thread {
    //  Default Constructor
    public Car() {
    }

    //  Constructor with Name
    public Car(String name) {
        super(name);
    }

    // Constructor with Runnable Interface
    public Car(Runnable target) {
        super(target);
    }

    //  Constructor with Both
    public Car(Runnable target, String name) {
        super(target, name);
    }
}

class Bike implements Runnable {
    @Override
    public void run() {
        System.out.println("Racing Bike...");
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        Car C = new Car();

        Car C1 = new Car("Shilajit");

        Bike B = new Bike();
        Car C2 = new Car(B);

        Car C3 = new Car(B, "Shilajit");


        System.out.println("Id of C is = " + C.getId());

        System.out.println("Id of C1 is = " + C1.getId());
        System.out.println("Name of C1 is = " + C1.getName());

        C2.start();
        System.out.println("Id of C2 is = " + C2.getId());
        System.out.println("Name of C2 is = " + C2.getName());

        C3.start();
        System.out.println("Id of C3 is = " + C3.getId());
        System.out.println("Name of C2 is = " + C3.getName());
    }
}
