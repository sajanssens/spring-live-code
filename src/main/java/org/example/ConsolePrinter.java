package org.example;

public class ConsolePrinter implements PrinterService {
    @Override public void print(String m) {
        System.out.println(m);
    }
}
