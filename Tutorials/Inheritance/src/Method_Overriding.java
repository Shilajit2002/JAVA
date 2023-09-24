class Car{
    //  Method
    public void Horn(){
        System.out.println("Car Horn .... *****************");
    }

    //  Another Method
    public void Break(){
        System.out.println("Breakkkkkkkkkkkk...............!!!!!!!");
    }
}

class BMW extends Car{
    //  Method
    @Override //  This is the declaration of Overriding the Method '@Override'
    public void Horn() {
        System.out.println("BMW Horn .... #################");
    }

    //  Another Method
    @Override
    public void Break(){
        super.Break();
        System.out.println("Stopped................|||||||||||||");
    }

}

public class Method_Overriding {
    public static void main(String[] args) {
        BMW B = new BMW();

        // This will call the BMW Horn Method because B is the Object of BMW.So its refer BMW class
        B.Horn();

        Car C = new Car();

        // This will call the Car Horn Method because C is the Object of Car.So its refer Car class
        C.Horn();

        System.out.println("-------------------------------------------");

        //  here Both Break method will call because in BMW class Car Break Method is called using Super Keyword
        B.Break();
    }
}
