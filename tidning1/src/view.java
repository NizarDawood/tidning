import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class view {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextPane textPane1;
    private JPanel panel;
    private JFormattedTextField formattedTextField1;

    JFrame frame;

    public view() {
        frame = new JFrame("view");
        frame.setContentPane(this.panel);
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
    }

    public static void main(String[] args) {
        view v = new view();
    }
}