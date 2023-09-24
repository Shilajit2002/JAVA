package Frame;

import javax.swing.*;
import java.util.Objects;

public class FrameDemo1 extends JFrame {
    private ImageIcon icon;

    public FrameDemo1() {
        //  Showing the Frame
        setVisible(true);

        //  When Click Cross of the Frame then Program will exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  Frame Set Bound (Position & Size Set in One)
        setBounds(200, 50, 400, 300);

        //  Frame Title
        setTitle("Frame Demo");

        //  Frame Not Resize
        setResizable(false);

        initComponents();
    }

    public void initComponents() {
        //  Set Custom Icon
        icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("E:\\VS Code\\Java\\Tutorials\\Swing\\src\\Frame\\Hello.png")));
    }

    public static void main(String[] args) {
        FrameDemo1 frameDemo1 = new FrameDemo1();
    }
}
