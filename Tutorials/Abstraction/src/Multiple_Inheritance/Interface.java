package Multiple_Inheritance;

interface Car{
    public void Football();
}

interface Bike{
    public void Football1();
}

interface Cycle{
    public void Football2();
}

//  A Interface can Extend Multiple Interfaces
interface Driver extends Car,Bike,Cycle{
    public void Football3();
}

public class Interface {
    public static void main(String[] args) {
        System.out.println("Interfaces Multiple Inheritance");
    }
}