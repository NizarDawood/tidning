public class Teknik {
    private String titel;
    private String text;
    private String författare;
    private String datum;

    public Teknik(String titel, String text, String författare, String datum) {
        this.titel = titel;
        this.text = text;
        this.författare = författare;
        this.datum = datum;
    }

    public String getDatum() {
        return datum;
    }




    public String getFörfattare() {
        return författare;
    }

    public String getText() {
        return text;
    }

    public String getTitel() {
        return titel;
    }

}
