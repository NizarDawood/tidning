import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vaderview {
    private JTextArea textArea1;

    private JPanel panel3;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public vaderview() {
        JFrame frame = new JFrame("view");
        frame.setContentPane(this.panel3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sportview sport = new sportview();
                frame.setContentPane(sport.getPanel1());
                frame.pack();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vaderview vader = new vaderview();
                frame.setContentPane(vader.getPanel3());
                frame.pack();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teknikview teknik = new teknikview();
                frame.setContentPane(teknik.getPanel2());
                frame.pack();
            }
        });
    }

    public static void main(String[] args) {
        vaderview v = new vaderview();
    }

    public Container getPanel3() {
        return getPanel3();
    }

    public JTextArea TextArea1() {
        return textArea1;
    }

}



// ett stirng i varje textarea
