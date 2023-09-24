package Interface;

//  Avon Cycle Child Class which is not Interface
//  A Class can Implements Interface
class AvonCycle implements Bicycle {
    //  It Must Override Bicycle Interface method because AvonCycle class is not Interface

    //  BiCycle Interface Method
    @Override
    public void ApplyBrake() {
        System.out.println("Avon Cycle Brake");
    }

    @Override
    public void SpeedUp() {
        System.out.println("Avon Cycle SpeedUp");
    }

    //  Normal Method
    public void Bell() {
        System.out.println("Avon Cycle Bell");
    }

}
