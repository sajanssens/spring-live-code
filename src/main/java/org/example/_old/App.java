package org.example._old;

import org.example.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class App {

    @Autowired @Logger
    private PrinterService ps;// = new PrinterService();

    @Autowired /*@Qualifier("hcSing")*/
    private HitCounter hc;

    public App() { }

    // injection point
    public App(PrinterService ps) {
        this.ps = ps;
    }

    public App(PrinterService ps, HitCounter hc) {
        this.ps = ps;
        this.hc = hc;
    }

    public void doeMaarWat() {
        int i = 0;
        int j = i + 9;

        ps.print("j is nu " + j);

        hc.inc();
        ps.print(hc.toString());
    }

    public void setPs(PrinterService ps) {
        this.ps = ps;
    }

    /*public void setLog(PrinterService ps) {
        this.ps = ps;
    }*/
}
