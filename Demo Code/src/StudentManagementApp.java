import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }
}

class StudentManagementSystem {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(int rollNumber) {
        studentList.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return studentList;
    }
}

public class StudentManagementApp extends JFrame {
    private StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
    private JTextArea outputTextArea;
    private JTextField rollNumberField, nameField, gradeField;

    public StudentManagementApp() {
        setTitle("Student Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        outputTextArea = new JTextArea(10, 30);
        outputTextArea.setEditable(false);

        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        inputPanel.add(new JLabel("Roll Number:"));
        rollNumberField = new JTextField();
        inputPanel.add(rollNumberField);
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Grade:"));
        gradeField = new JTextField();
        inputPanel.add(gradeField);

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        JButton searchButton = new JButton("Search Student");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchStudent();
            }
        });

        JButton displayButton = new JButton("Display All Students");
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayAllStudents();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(displayButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputTextArea), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addStudent() {
        try {
            int rollNumber = Integer.parseInt(rollNumberField.getText());
            String name = nameField.getText();
            String grade = gradeField.getText();

            Student student = new Student(name, rollNumber, grade);
            studentManagementSystem.addStudent(student);

            rollNumberField.setText("");
            nameField.setText("");
            gradeField.setText("");
            outputTextArea.setText("Student added successfully.");
        } catch (NumberFormatException ex) {
            outputTextArea.setText("Please enter a valid roll number.");
        }
    }

    private void searchStudent() {
        try {
            int rollNumber = Integer.parseInt(rollNumberField.getText());
            Student student = studentManagementSystem.searchStudent(rollNumber);

            if (student != null) {
                outputTextArea.setText("Name: " + student.getName() +
                        ", Roll Number: " + student.getRollNumber() +
                        ", Grade: " + student.getGrade());
            } else {
                outputTextArea.setText("Student not found.");
            }
        } catch (NumberFormatException ex) {
            outputTextArea.setText("Please enter a valid roll number.");
        }
    }

    private void displayAllStudents() {
        List<Student> students = studentManagementSystem.getAllStudents();
        outputTextArea.setText("");
        for (Student student : students) {
            outputTextArea.append("Name: " + student.getName() +
                    ", Roll Number: " + student.getRollNumber() +
                    ", Grade: " + student.getGrade() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentManagementApp app = new StudentManagementApp();
            app.setVisible(true);
        });
    }
}
