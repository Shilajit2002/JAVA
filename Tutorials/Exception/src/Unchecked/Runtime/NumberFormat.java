package Unchecked.Runtime;

public class NumberFormat {
    public static void main(String[] args) {
        try{
            throw new NumberFormatException();
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
