package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ballenbak = new AnnotationConfigApplicationContext();
        ballenbak.scan(App.class.getPackage().getName());
        ballenbak.refresh();

        App app = ballenbak.getBean("app",App.class);
        // App app = new App(); // not spring managed, so no DI possible inside this instance
        app.doeMaarWat();

        App app2 = ballenbak.getBean("app2", App.class);
        app2.doeMaarWat();
    }
}
