package Practice;

abstract class Pen{
    public abstract void write();
    public abstract void refill();
}

class FountainPen extends Pen{
    @Override
    public void write() {
        System.out.println("Fountain Pen Write");
    }

    @Override
    public void refill() {
        System.out.println("Fountain Pen Refill");
    }

    public void changeNib(){
        System.out.println("Fountain Pen Nib");
    }
}

class Pen_Drive{
    public static void main(String[] args) {
        FountainPen F = new FountainPen();
        F.write();
        F.refill();
        F.changeNib();
    }
}
