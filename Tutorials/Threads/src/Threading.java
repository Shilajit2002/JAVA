class Cook extends Thread{
    //  Implement Run Method which exists in Thread Class
    @Override
    public void run(){
        int i = 0;
        while (i<100000){
            System.out.println("Cooking");
            i++;
        }
    }
}

class Chat extends Thread{
    //  Implement Run Method which exists in Thread Class
    @Override
    public void run(){
        int i = 0;
        while (i<100000){
            System.out.println("Chatting");
            i++;
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        Cook C1 = new Cook();
        Chat C2 = new Chat();

        //  Start is a Thread Method that Call the Run Method in Java Thread Class
        C1.start();
        C2.start();
    }
}
