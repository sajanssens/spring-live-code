package org.example;

public class MainDIY {

    public static void main(String[] args) {
        // DIY DI

        // Stap 1: instances van injectables maken
        PrinterService con = new ConsolePrinter();
        PrinterService log = new LoggerPrinter();

        // Stap 2: injectables injecteren op de juiste plekken
        App app = new App(log);

        // je app-code runnen
        app.doeMaarWat();
    }
}
