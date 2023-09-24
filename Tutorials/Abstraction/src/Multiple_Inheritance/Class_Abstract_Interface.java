package Multiple_Inheritance;

//  A Class can Implements Multiple Interfaces
class Marti implements Car,Bike,Cycle{
    @Override
    public void Football() {
        System.out.println("Football");
    }

    @Override
    public void Football1() {
        System.out.println("Football1");
    }

    @Override
    public void Football2() {
        System.out.println("Football2");
    }
}

abstract class Roky{
    public abstract void RokStar();
}

//  A Class can Extend 1 abstract class and Implements Multiple Interfaces
class Bomb extends Roky implements Car,Bike,Cycle{
    @Override
    public void Football() {
        System.out.println("Football");
    }

    @Override
    public void Football1() {
        System.out.println("Football1");
    }

    @Override
    public void Football2() {
        System.out.println("Football2");
    }

    @Override
    public void RokStar() {
        System.out.println("RockStar");
    }
}

class Hello{
    public void Print(){
        System.out.println("Printing");
    }
}

// A Class can Extend 1 class and Implements Multiple Interfaces
class Greet extends Hello implements Car,Bike,Cycle{
    @Override
    public void Football() {
        System.out.println("Football");
    }

    @Override
    public void Football1() {
        System.out.println("Football1");
    }

    @Override
    public void Football2() {
        System.out.println("Football2");
    }

    @Override
    public void Print() {
        super.Print();
    }
}

public class Class_Abstract_Interface {
    public static void main(String[] args) {
        System.out.println("Interfaces Multiple Inheritance");
    }
}
