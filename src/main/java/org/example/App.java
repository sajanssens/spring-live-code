package org.example;

public class App {

    private PrinterService ps;// = new PrinterService();

    public App(PrinterService ps) {
        this.ps = ps;
    }

    public void doeMaarWat() {
        int i = 0;
        int j = i + 9;

        ps.print("j is nu " + j);
    }
}
