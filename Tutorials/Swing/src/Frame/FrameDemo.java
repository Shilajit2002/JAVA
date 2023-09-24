package Frame;

import javax.swing.*;

public class FrameDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        //  Showing the Frame
        frame.setVisible(true);

        //  When Click Cross of the Frame then Program will exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  Frame Size Setting
        //  frame.setSize(400,300);

        //  Frame Set Center
        //  frame.setLocationRelativeTo(null);

        //  Frame Set Position
        //  frame.setLocation(200,50);

        //  Frame Set Bound (Position & Size Set in One)
        frame.setBounds(200,50,400,300);

        //  Frame Title
        frame.setTitle("Frame Demo");

        //  Frame Not Resize
        frame.setResizable(false);
    }
}
