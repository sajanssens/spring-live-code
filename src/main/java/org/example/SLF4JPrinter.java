package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SLF4JPrinter implements PrinterService {

    @Override
    public void print(String m) {
        log.debug(m);
    }
}
