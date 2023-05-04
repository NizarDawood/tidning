import javax.swing.*;
import java.sql.*;

public class Tidning {

    private DagensNyheter dagensNyheter;
    private Sport sport;
    private Teknik teknik;
    private Väder väder;

    public Tidning() {
        dagensNyheter = new DagensNyheter();
        sport = new Sport();
        teknik = new Teknik();
        väder = new Väder();
    }

    public DagensNyheter getDagensNyheter() {
        return dagensNyheter;
    }
    public static void main(String[] args) {
       /// databas.md


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

