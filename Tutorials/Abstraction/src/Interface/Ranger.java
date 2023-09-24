package Interface;

//  Ranger Child Class which is also Interface
//  An Interface can Extend another Interface
interface Ranger extends Bicycle {
    //  Here not need to Override Bicycle Interface method because Ranger class also Interface

    // Interface Method
    public void Print();
}
