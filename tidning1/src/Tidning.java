import javax.swing.*;

public class Tidning {

    private DagensNyheter dagensNyheter;
    private Sport sport;
    private Teknik teknik;
    private Väder väder;

    public Tidning() {
        dagensNyheter = new DagensNyheter();
       // sport = new Sport();
        //teknik = new Teknik();
        väder = new Väder();
    }

    public DagensNyheter getDagensNyheter() {
        return dagensNyheter;
    }
    public void main(String[] args) {
       /// databas.md
        JFrame frame;

        frame = new JFrame("view");
        frame.setContentPane(this.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

// skriva ut sidan dagensnyheter
        Tidning tidning = new Tidning();
        DagensNyheter dagensNyheter = tidning.getDagensNyheter();
        System.out.println("Dagens nyheter:");
        System.out.println("Titel: " + dagensNyheter.getTitel());
        System.out.println("Text: " + dagensNyheter.getText());
        System.out.println("Författare: " + dagensNyheter.getFörfattare());
        System.out.println("Datum: " + dagensNyheter.getDatum());
    }



}

