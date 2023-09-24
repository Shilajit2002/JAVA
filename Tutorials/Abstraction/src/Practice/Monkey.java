package Practice;

class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }

    public void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

class Human_Monkey{
    public static void main(String[] args) {
        Human H = new Human();
        H.jump();
        H.bite();
        H.eat();
        H.sleep();
    }
}
