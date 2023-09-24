package DialogWindow;

import javax.swing.*;

public class MessageDialog3 {
    public static void main(String[] args) {
        //  First Parameter null means the dialog box will be set at the center
        //  Second Parameter is the Text for the dialog box
        //  Third Parameter is the Title of Dialog Box
        //  Fourth Parameter is the Icon of the Dialog Box
        //  Fifth Parameter is the Custom Icon of the Dialog Box

        ImageIcon icon = new ImageIcon("E:\\VS Code\\Java\\Tutorials\\Swing\\src\\DialogWindow\\Hello.png");
        JOptionPane.showMessageDialog(null, "Hello Google",
                "Greetings", JOptionPane.PLAIN_MESSAGE, icon);
    }
}
