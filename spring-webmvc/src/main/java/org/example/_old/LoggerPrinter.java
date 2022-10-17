package org.example._old;

import lombok.extern.slf4j.Slf4j;
import org.example.util.Logger;
import org.springframework.stereotype.Component;

@Slf4j @Component @Logger
public class LoggerPrinter implements PrinterService {
    @Override
    public void print(String m) {
        log.debug(m);
    }
}
