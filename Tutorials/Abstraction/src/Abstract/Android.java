package Abstract;

//  Phone Model Child Class which is also Abstract
//  An Abstract Class can Extend another Abstract Class
abstract class Android extends PhoneModel {
    //  Here not need to Override PhoneModel abstract method because Android class also abstract

    //  Normal Method
    public void Camara() {
        System.out.println("Camara from Android");
    }

    //  Abstract Method
    public abstract void Music();
}
