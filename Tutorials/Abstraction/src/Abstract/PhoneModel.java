package Abstract;

//  Abstract Class
abstract class PhoneModel {

    //  Normal Method
    public void Hello() {
        System.out.println("Hello from PhoneModel");
    }

    public void Game() {
        System.out.println("Game from PhoneModel");
    }

    //  Abstract Method
    public abstract void Call();
}
