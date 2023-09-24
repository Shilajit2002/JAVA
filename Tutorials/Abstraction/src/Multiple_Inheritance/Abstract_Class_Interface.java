package Multiple_Inheritance;

//  An abstract Class can Implements Multiple Interfaces
abstract class Huge implements Car,Bike,Cycle{

}

class Rok{

}

//  An abstract Class can Extend 1 class and Implements Multiple Interfaces
abstract class Universe extends Rok implements Car,Bike,Cycle{

}

abstract class Morning{

}

// An abstract Class can Extend 1 abstract class and Implements Multiple Interfaces
abstract class Night extends Morning implements Car,Bike,Cycle{

}

public class Abstract_Class_Interface {
    public static void main(String[] args) {
        System.out.println("Interfaces Multiple Inheritance");
    }
}
