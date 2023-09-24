package DialogWindow;

import javax.swing.*;

public class InputDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name : ");
        JOptionPane.showMessageDialog(null, name + " Welcome to Swing");

        String name1 = JOptionPane.showInputDialog("Enter Your Name : ", "Jit");
        JOptionPane.showMessageDialog(null, name1 + " Welcome to Swing");

        String name2 = JOptionPane.showInputDialog(null, "Enter First Name : ",
                "This is Title", JOptionPane.QUESTION_MESSAGE);
        String name3 = JOptionPane.showInputDialog(null, "Enter Last Name : ",
                "This is Title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Welcome " + name2 + " " + name3);
    }
}
