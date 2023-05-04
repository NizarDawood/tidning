public class DagensNyheter {
    private String titel;
    private String text;
    private String författare;
    private String datum;

    public DagensNyheter() {
        titel = "hej ";
        text = "vad händer";
        författare = "nizar";
        datum = "202092";
    }
    // public DagensNyheter(String titel, String text, String författare, String datum) {
    //      this.titel = titel;
    //      this.text = text;
    //      this.författare = författare;
    //      this.datum = datum;
    //   }

    public String getTitel() {
        return titel;
    }


    public String getText() {
        return text;
    }


    public String getFörfattare() {
        return författare;
    }

    public String getDatum() {
        return datum;
    }

}
