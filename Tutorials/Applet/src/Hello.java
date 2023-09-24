import java.applet.Applet;
import java.awt.*;

public class Hello extends Applet {
    public void paint(Graphics g){
        g.drawString("Hello World",25,20);
        showStatus("Status Window");
    }
}
