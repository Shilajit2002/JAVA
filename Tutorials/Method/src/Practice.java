public class Practice {
    //  Multiplication Table
    public void mulTable(int n){
        // Question 1
        System.out.println("Question 1");
        System.out.println(n+" Multiplication Table");
        for (long i = 1; i <=10; i++) {
            System.out.println(n+" X "+i+" : "+(n*i));
        }
    }

    //  Star Patterns
    public void Patterns(int n){
        //  Question 2
        System.out.println("Question 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("------------------------");

        //  Question 4
        System.out.println("Question 4");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("------------------------");

        //  Question 11
        System.out.println("Question 11");
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=(n-i);space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");;
            }
            System.out.print("\n");
        }
    }

    //  Sum of N numbers
    public long sum(int n){
        //  Question 3
        if (n>0){
            return n+sum(n-1);
        }
        else {
            return 0;
        }
    }

    //  Fibonacci Numbers
    public int fibonacci(int n){
        //  Question 5
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    //  Average
    public void avg(int ...arr){
        //  Question 6
        int sum=0;
        for (int i:arr) {
            sum+=i;
        }
        System.out.println("Average : "+sum/arr.length);
    }

    //  Celsius to Fahrenheit
    public void CtoF(int c){
        //  Question 9
        System.out.println("Celsius : "+c);
        System.out.println("Fahrenheit : "+((1.8*c)+32));
    }

    public static void main(String[] args) {
        Practice P = new Practice();

        // Question 1
        P.mulTable(5);

        System.out.println("------------------------");

        //  Question 2 & Question 4 & Question 5
        P.Patterns(5);

        System.out.println("------------------------");

        // Question 3
        System.out.println("Question 3");
        System.out.println("Sum of 10 numbers : "+P.sum(10));

        System.out.println("------------------------");

        //  Question 5
        System.out.println("Question 5");
        System.out.println("Fibonacci no. of 10 Series : "+P.fibonacci(10));

        System.out.println("------------------------");

        //  Question 6
        System.out.println("Question 6");
        P.avg(47,85,96,100,27,54,86,32,100,24,99,75,63,100);

        System.out.println("------------------------");

        //  Question 9
        System.out.println("Question 9");
        P.CtoF(35);
    }
}
