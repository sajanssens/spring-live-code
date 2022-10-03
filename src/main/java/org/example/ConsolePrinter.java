package org.example;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConsolePrinter implements PrinterService {

    private int size;

    public ConsolePrinter(int i) {
        this.size = i;
    }

    @Override
    public void print(String m) {
        System.out.println(m);
    }
}
