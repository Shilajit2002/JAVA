import java.util.Scanner;

public class Data_Types_Check {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Integer = ");
        System.out.println(s.hasNextInt());
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a Short = ");
        System.out.println(s1.hasNextShort());
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter a Byte = ");
        System.out.println(s2.hasNextByte());
        Scanner s3 = new Scanner(System.in);
        System.out.print("Enter a Long = ");
        System.out.println(s3.hasNextLong());
        Scanner s4 = new Scanner(System.in);
        System.out.print("Enter a Boolean = ");
        System.out.println(s4.hasNextBoolean());
        Scanner s5 = new Scanner(System.in);
        System.out.print("Enter a Float = ");
        System.out.println(s5.hasNextFloat());
        Scanner s6 = new Scanner(System.in);
        System.out.print("Enter a Double = ");
        System.out.println(s6.hasNextDouble());
        Scanner s7 = new Scanner(System.in);
        System.out.print("Enter a Character or String = ");
        System.out.println(s7.hasNext());
        Scanner s8 = new Scanner(System.in);
        System.out.print("Enter a Full String = ");
        System.out.println(s8.hasNextLine());
    }
}
