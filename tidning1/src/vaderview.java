import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vaderview {
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea5;
    private JTextArea textArea6;
    private JTextArea textArea7;
    private JTextArea textArea4;
    private JTextArea textArea8;
    private JTextArea textArea9;
    private JTextArea textArea10;
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

    public JTextArea TextArea2() {
        return textArea2;
    }

    public JTextArea TextArea3() {
        return textArea3;
    }

    public JTextArea TextArea4() {
        return textArea4;
    }


    public JTextArea TextArea5() {
        return textArea5;
    }

    public JTextArea TextArea6() {
        return textArea6;
    }

    public JTextArea TextArea7() {
        return textArea7;
    }

    public JTextArea TextArea8() {
        return textArea8;
    }

    public JTextArea TextArea9() {
        return textArea9;
    }

    public JTextArea TextArea10() {
        return textArea10;
    }


}



// ett stirng i varje textarea
