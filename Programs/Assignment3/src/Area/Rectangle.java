package Area;

class Rectangle{
    private double height;
    private double width;

    // Default Constructor
    public Rectangle(){
        height=0.0;
        width=0.0;
    }

    // Parameterized Constructor
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Mutator Method
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Accessor Method
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    // Get Area Method
    public double getArea(){
        return height*width;
    }

    // ToString Method
    public String toString(){
        return "Height : "+height+"\nWidth : "+width;
    }
}
