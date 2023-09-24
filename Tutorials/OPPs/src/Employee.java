//  Question 1
public class Employee {
    private int salary;
    private String name;

    //  Mutator Method
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    //  Accessor Method
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Employee E=new Employee();
        E.setName("Shilajit");
        E.setSalary(50000);
        System.out.println("Name : "+E.getName()+"\nSalary : "+E.getSalary());

        E.setName("Rahul");
        E.setSalary(100000);
        System.out.println("Name : "+E.getName()+"\nSalary : "+E.getSalary());
    }

}
