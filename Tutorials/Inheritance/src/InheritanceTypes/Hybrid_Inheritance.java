package InheritanceTypes;

class Hybrid_Inheritance_A {
    //  I am a Parent Class
}

class  Hybrid_Inheritance_B extends Hybrid_Inheritance_A{
    //  I am Child Class of Hybrid_Inheritance_A
}

class Hybrid_Inheritance_C extends Hybrid_Inheritance_A{
    //  I am also Child Class of Hybrid_Inheritance_A
}

class Hybrid_Inheritance_D extends Hybrid_Inheritance_A{
    //  I am also Child Class of Hybrid_Inheritance_A
}

/*
class Hybrid_Inheritance_E extends Hybrid_Inheritance_C, Hybrid_Inheritance_D {
    //  I am Child Class of Hybrid_Inheritance_C & Hybrid_Inheritance_D

    //  Its,Showing Error because Java doesn't support Multiple Inheritance

    //  So this reason Hybrid Inheritance also not Supported by java
}
*/