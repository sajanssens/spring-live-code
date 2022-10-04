package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Configuration
public class Config {

    /*@Bean
    public ConsolePrinter con() { return new ConsolePrinter(); }*/

    /*@Bean
    public LoggerPrinter log() { return new LoggerPrinter(); }*/

    @Bean
    public App app() { return new App(); }

    @Bean
    public App app2() { return new App(); }

    @Bean @Scope(SCOPE_SINGLETON) @Qualifier("hcSing")
    public HitCounter hcSing() {
        return new HitCounter();
    }

    @Bean @Scope(SCOPE_PROTOTYPE)
    public HitCounter hcProto() {
        return new HitCounter();
    }
}
