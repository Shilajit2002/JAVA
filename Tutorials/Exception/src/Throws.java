import java.util.Scanner;

public class Throws {

    public static double Div(int a,int b) throws ArithmeticException{
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a & b = ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        try{
            System.out.println("Division = "+Div(a,b));
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
