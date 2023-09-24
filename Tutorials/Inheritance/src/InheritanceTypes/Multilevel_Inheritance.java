package InheritanceTypes;

class Multilevel_Inheritance_A{
    //  I am Super Class

    //  Parent CLass
}

class Multilevel_Inheritance_B extends Multilevel_Inheritance_A{
    //  I am Sub Class of Multilevel_Inheritance_A
    //  I am Super Class of Multilevel_Inheritance_C

    //  Child Class
}

class Multilevel_Inheritance_C extends Multilevel_Inheritance_B{
    //  I am Sub Class of Multilevel_Inheritance_B

    //  Grand Child Class
}
