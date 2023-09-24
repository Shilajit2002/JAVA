package Area;

import java.io.*;
import java.util.*;

class Demo{
    public static void main (String[] args) throws IOException {
        //  Input from the file input.txt
        Scanner sc= new Scanner(new File("E:\\VS Code\\Java\\Programs\\Assignment3\\src\\Area\\input.txt"));

        double height=sc.nextDouble();
        double width=sc.nextDouble();

        System.out.println("**Rectangle**");

        Rectangle rec=new Rectangle(height,width);
        System.out.println (rec);
        System.out.println ("Area of Rectangle is = "+rec.getArea());

        System.out.println ("\n----------------------------\n");

        height=sc.nextDouble();
        width=sc.nextDouble();
        double depth=sc.nextDouble();

        System.out.println("**Cuboid**");

        Cuboid cu=new Cuboid(height,width,depth);
        System.out.println (cu);
        System.out.println ("Surface Area of Cuboid is = "+cu.getArea());
    }
}
