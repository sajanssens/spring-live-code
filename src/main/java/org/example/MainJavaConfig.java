package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaConfig {

    public static void main(String[] args) {
        ApplicationContext ballenbak =
                new AnnotationConfigApplicationContext(Config.class);

        App app = ballenbak.getBean(App.class);
        app.doeMaarWat();

        App app2 = ballenbak.getBean("app2", App.class);
        app2.doeMaarWat();
    }
}
