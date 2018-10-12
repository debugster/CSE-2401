import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AdapterDemo extends JFrame {
    JTextArea t;

    AdapterDemo(String title) {
        super(title);

        setLayout(new FlowLayout());

        t = new JTextArea();
        t.setBounds(10, 20, 300, 200);
        add(t);
        t.addKeyListener(new MyKeyAdapter(t));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyKeyAdapter extends KeyAdapter {
    JTextArea t;

    MyKeyAdapter(JTextArea t) {
        this.t = t;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        t.setText(e.getKeyChar() + " is typed.");
    }
}