package Unchecked.Runtime;

public class NullPointer {
    public static void main(String[] args) {
        String S=null;
        try{
            if(S.equals("Hello")){
                System.out.println("Correct");
            }
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
