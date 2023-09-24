package Area;

class Cuboid extends Rectangle{
    private double depth;

    // Default Constructor
    public Cuboid(){
        depth=0.0;
    }

    // Parameterized Constructor
    public Cuboid(double height, double width, double depth) {
        super(height,width);
        this.depth = depth;
    }

    // Mutator Method
    public void setDepth(double depth) {
        this.depth = depth;
    }

    // Accessor Method
    public double getDepth() {
        return depth;
    }

    // Surface Area Method
    public double getArea(){
        return 2*((super.getHeight()*super.getWidth())+(super.getHeight()*depth)+(super.getWidth()*depth));
    }

    // To String Method
    public String toString(){
        return super.toString()+"\nDepth : "+depth;
    }
}
