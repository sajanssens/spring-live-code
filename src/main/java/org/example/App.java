package org.example;

public class App {

    private PrinterService ps;// = new PrinterService();
    private HitCounter hc;

    public App() {
    }

    // injection point
    public App(PrinterService ps, HitCounter hc) {
        this.ps = ps;
        this.hc = hc;
    }

    public App(PrinterService ps) {
        this.ps = ps;
        this.hc = new HitCounter();
    }

    public void doeMaarWat() {
        int i = 0;
        int j = i + 9;

        ps.print("j is nu " + j);

        hc.inc();
        ps.print(hc.toString());
    }

    public void setCon(PrinterService ps) {
        this.ps = ps;
    }

    /*public void setLog(PrinterService ps) {
        this.ps = ps;
    }*/
}
