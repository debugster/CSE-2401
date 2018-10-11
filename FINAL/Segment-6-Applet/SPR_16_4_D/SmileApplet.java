import java.applet.Applet;
import java.awt.*;

public class SmileApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(20,20,150,150);   // For face
        g.setColor(Color.BLACK);
        g.fillOval(50,60,15,25);     // Left Eye
        g.fillOval(120,60,15,25);    // Right Eye
        g.drawArc(55,95,78,50,0,-180);  // Smile
    }
}