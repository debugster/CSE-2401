import javax.swing.*;
import java.awt.*;

public class ButtonDemo extends JFrame {
    JButton b;

    ButtonDemo(String title) {
        super(title);
        setLayout(new FlowLayout());
        b = new JButton("Click Me!");
        add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
