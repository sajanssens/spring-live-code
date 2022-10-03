package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Configuration
public class Config {

    @Bean
    public ConsolePrinter con() { return new ConsolePrinter(); }

    @Bean
    public SLF4JPrinter log() { return new SLF4JPrinter(); }

    @Bean @Primary
    public App app() { return new App(con(), hcProto()); }

    @Bean
    public App app2() { return new App(log(), hcProto()); }

    @Bean @Scope(SCOPE_SINGLETON)
    public HitCounter hcSing() {
        return new HitCounter();
    }

    @Bean @Scope(SCOPE_PROTOTYPE)
    public HitCounter hcProto() {
        return new HitCounter();
    }
}
