import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code = ApplTest.java width = 300 height = 200>
</applet>
*/

public class Prog31ApltTest extends Applet {
    // private TextField tf;
    public void init() {
        TextField tf = new TextField(10);
        add(tf);
    }

    public void paint(Graphics g) {
        g.drawString("Hello", 6, 50);
    }

}