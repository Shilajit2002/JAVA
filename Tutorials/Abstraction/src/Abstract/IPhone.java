package Abstract;

//  Phone Model Child Class which is not Abstract
//  A class can Extend Abstract Class
class IPhone extends PhoneModel {
    //  It Must Override PhoneModel abstract method because IPhone class is not abstract

    //  Phone Model Abstract Method
    @Override
    public void Call() {
        System.out.println("Call from IPhone but Method is Abstract in PhoneModel");
    }

    //  Normal Method
    @Override
    public void Hello() {
        System.out.println("Hello from Iphone");
    }

    public void Run() {
        System.out.println("Run From IPhone");
    }
}
