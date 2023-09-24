import java.util.Scanner;

class Student {
    private String Name;
    private double[] marks = new double[5];

    // Constructor initialize
    public Student(String n, double[] arr) {
        Name = n;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = arr[i];
        }
    }

    // Mutator method
    public void setMarks(double[] arr) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = arr[i];
        }
    }

    public void setName(String n) {
        Name=n;
    }

    // Accessor method
    public double[] getMarks() {
        return marks;
    }

    public String getName() {
        return Name;
    }

    // Average Marks
    public double average() {
        double total = 0.0, avg;
        for (double d : marks) {
            total += d;
        }
        return (total / marks.length);
    }

    // Grade Calculator
    public String grade() {
        double avg = average();
        if (avg >= 90) {
            return "O";
        } else if (avg >= 80) {
            return "E";
        } else if (avg >= 70) {
            return "A";
        } else if (avg >= 60) {
            return "B";
        } else if (avg >= 50) {
            return "C";
        } else if (avg >= 40) {
            return "D";
        }
        return "F";
    }

    // To String Method
    public String toString() {
        return "Name: \t\t" + Name + "\nMarks: \t\t" + marks[0] + "\t" + marks[1] + "\t" + marks[2] + "\t" + marks[3]
                + "\t"
                + marks[4] + "\nAverage: \t" + average() + "\nGrade: \t\t" + grade();
    }
}

class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n;
        double[] arr = new double[5];

        System.out.print("Enter Student Name : ");
        n = sc.nextLine();

        System.out.print("Enter marks of 5 Subjects = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println("\n---- Student Details ----\n");
        Student St = new Student(n, arr);
        System.out.println(St);
    }
}