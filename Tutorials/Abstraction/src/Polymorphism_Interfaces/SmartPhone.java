package Polymorphism_Interfaces;

public class SmartPhone extends CellPhone implements GPS,Camera,MediaPlayer{
    // Interfaces Method

    @Override
    public void Cam() {
        System.out.println("Camara from SmartPhone Using Camera Interface");
    }

    @Override
    public void Location() {
        System.out.println("Location from SmartPhone Using GPS Interface");
    }

    @Override
    public void Music() {
        System.out.println("Music from SmartPhone Using Media Player Interface");
    }

    //  Method
    public void Greet(){
        System.out.println("Thank You for Using Smartphone");
    }
}
