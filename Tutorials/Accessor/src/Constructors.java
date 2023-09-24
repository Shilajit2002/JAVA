public class Constructors {

    //  Instance variables
    private int salary;

    //  Default Constructor
    public Constructors(){
        this.salary=1000;
    }

    //  Parameterized Constructor
    public Constructors(int salary){
        this.salary=salary;
    }

    //  Another Constructor Using Another Parameter
    public Constructors(int ...arr){
        System.out.println("Constructor Overloading");
        for (int val:
             arr) {
            System.out.print(val+"||");
        }
    }

    //  These three Constructor takes same name but default Parameters
    //  So this is also known as Constructor Overloading

    //  Copy Constructor
    public Constructors(Constructors C){
        this.salary=C.salary;
    }

    //  Mutator & Accessor Method
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        //  Default Constructor will call
        Constructors D = new Constructors();
        System.out.println("Default Constructor || Salary = "+D.getSalary());

        //  Parameterized Constructor will call
        Constructors P = new Constructors(4000);
        System.out.println("Parameterized Constructor || Salary = "+P.getSalary());

        //  Array Constructor will call
        //  Constructor Overloading
        Constructors A=new Constructors(200,700,800,900,1000,7000,3000,7620,420,986,123,465,78936);

        //  Copy Constructor will call
        Constructors C=new Constructors(P);
        System.out.println("\nCopy Constructor || Salary = "+C.getSalary());
    }
}
