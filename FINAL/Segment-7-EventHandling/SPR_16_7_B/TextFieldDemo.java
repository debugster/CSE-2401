import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextFieldDemo extends JFrame implements KeyListener {
    JTextField t1;
    JTextField t2;

    TextFieldDemo(String title) {
        super(title);
        t1 = new JTextField(50);
        t2 = new JTextField(50);
        t1.setText("Name");
        t2.setText("Father\'s Name");

        setLayout(new FlowLayout());
        add(t1);
        add(t2);

        t1.addKeyListener(this);
        t2.addKeyListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            JFrame tempFrame = new JFrame("Message");
            if (e.getSource() == t1) {
                JOptionPane.showMessageDialog(tempFrame, "Name: " + t1.getText());
            }
            else if (e.getSource() == t2) {
                JOptionPane.showMessageDialog(tempFrame, "Father\'s Name: " + t2.getText());
            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // empty
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // empty
    }
}
