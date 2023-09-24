package Unchecked.Runtime;

public class IllegalArgument {
    public static void main(String[] args) {
        try{
            throw new IllegalArgumentException();
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
