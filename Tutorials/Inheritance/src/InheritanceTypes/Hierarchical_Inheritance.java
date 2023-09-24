package InheritanceTypes;

class Hierarchical_Inheritance_A {
    //  I am a Parent Class
}

class  Hierarchical_Inheritance_B extends Hierarchical_Inheritance_A{
    //  I am Child Class of Hierarchical_Inheritance_A
}

class Hierarchical_Inheritance_C extends Hierarchical_Inheritance_A{
    //  I am also Child Class of Hierarchical_Inheritance_A
}

class Hierarchical_Inheritance_D extends Hierarchical_Inheritance_A{
    //  I am also Child Class of Hierarchical_Inheritance_A
}


//  1 Parent Class.....3 Child Class

/*                                      Hierarchical_Inheritance_A
                                                    ^
                                                    |
            --------------------------------------------------------------------------------
            ^                                     ^                                        ^
            |                                     |                                        |
Hierarchical_Inheritance_B              Hierarchical_Inheritance_C           Hierarchical_Inheritance_D

 */