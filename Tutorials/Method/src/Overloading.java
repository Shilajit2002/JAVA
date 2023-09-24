public class Overloading {

    // sum method no argument
    public void sum(){
        int a=9,b=8;
        System.out.println("Sum = "+(a+b));
    }

    // sum method 1 argument
    public void sum(int x){
        int a=x,b=8;
        System.out.println("Sum One Argument Pass= "+(a+b));
    }

    // sum method 2 argument
    public void sum(int x,int y){
        int a=x,b=y;
        System.out.println("Sum Two Argument Pass = "+(a+b));
    }

    // sum method array argument pass
    public void sum(int ...arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println("Sum Array = "+sum);
    }
    
    public static void main(String[] args) {
        
        Overloading O =new Overloading();

        O.sum();
        O.sum(2);
        O.sum(10,20);
        O.sum(1,2,3,4,5,6,7,8,9,10);
    }
}
