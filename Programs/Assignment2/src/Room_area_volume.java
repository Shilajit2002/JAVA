import java.util.*;

// Room Class
class Room {

    // Private Variables
    private double length;
    private double width;
    private double height;

    // Constructor
    public Room() {
        length = 0.0;
        width = 0.0;
        height = 0.0;
    }

    // Mutator method
    public void setLength(double l) {
        length=l;
    }

    public void setWidth(double w) {
        width=w;
    }

    public void setHeight(double h) {
        height=h;
    }


    // Accessor method
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Surface area method
    public double surfacearea() {
        return 2 * ((length * width) + (width * height) + (length * height));
    }

    // Volume method
    public double volume() {
        return length * width * height;
    }
}

// Driver class
class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l, w, h;

        System.out.print("Enter the length of the Room = ");
        l = sc.nextDouble();

        System.out.print("Enter the width of the Room = ");
        w = sc.nextDouble();

        System.out.print("Enter the height of the Room = ");
        h = sc.nextDouble();

        // Room object
        Room R = new Room();

        // Set the Value of length,width,height
        R.setLength(l);
        R.setWidth(w);
        R.setHeight(h);

        System.out.println("-------------------------------------------\n");
        System.out.println("Room Length : " + R.getLength() + "\nRoom Width : " + R.getWidth() + "\nRoom Height : "
                + R.getHeight());

        System.out.println("Surface Area of the Room is = " + R.surfacearea());

        System.out.println("Volume of the Room is = " + R.volume());
    }
}