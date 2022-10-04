package org.example;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service @Qualifier("con")
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
