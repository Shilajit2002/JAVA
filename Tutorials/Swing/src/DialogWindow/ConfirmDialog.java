package DialogWindow;

import javax.swing.*;

public class ConfirmDialog {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Dou you want to start the Quiz?",
                "Quiz", JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("YES");
        } else if (choice == JOptionPane.NO_OPTION) {
            System.out.println("NO");
        } else if (choice == JOptionPane.CANCEL_OPTION) {
            System.out.println("Cancel");
        }else{
            System.out.println("Close");
            System.exit(0);
        }
    }
}
