import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class view {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel panel4;
    private JTextArea textArea1;
    private JButton button4;


    public view() {
        JFrame frame = new JFrame("view");
        frame.setContentPane(this.panel4);
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
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view teknik = new view();
                frame.setContentPane(view.getPanel4());
                frame.pack();
            }
        });
    }

    public static void main(String[] args) {
        view v = new view();
    }


    public static Container getPanel4() {
        return getPanel4();
    }
}