package DialogWindow;

import javax.swing.*;

public class MessageDialog2 {
    public static void main(String[] args) {
        //  First Parameter null means the dialog box will be set at the center
        //  Second Parameter is the Text for the dialog box
        //  Third Parameter is the Title of Dialog Box
        //  Fourth Parameter is the Icon of the Dialog Box
        JOptionPane.showMessageDialog(null, "Hello World",
                "Normal", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong Password",
                "Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error!!",
                "Error", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Data Usage Alert",
                "Info", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Are You Want to do this?",
                "Question", JOptionPane.QUESTION_MESSAGE);

        // We can set icon through numbers
        JOptionPane.showMessageDialog(null, "Hello World",
                "Normal", -1);
        JOptionPane.showMessageDialog(null, "Wrong Password",
                "Warning", 2);
        JOptionPane.showMessageDialog(null, "Error!!",
                "Error", 0);
        JOptionPane.showMessageDialog(null, "Data Usage Alert",
                "Info", 1);
        JOptionPane.showMessageDialog(null, "Are You Want to do this?",
                "Question", 3);
    }
}
