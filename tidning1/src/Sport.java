public class Sport {
    private String titel;
    private String text;
    private String författare;
    private String datum;

    public Sport(String titel, String text, String författare, String datum) {
        this.titel = titel;
        this.text = text;
        this.författare = författare;
        this.datum = datum;
    }

    public String getText() {
        return text;
    }

    public String getTitel() {
        return titel;
    }

    public String getFörfattare() {
        return författare;
    }

    public String getDatum() {
        return datum;
    }

}
