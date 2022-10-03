package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

        App app = ctx.getBean("app", App.class);
        app.doeMaarWat();

        App app2 = ctx.getBean("app2", App.class);
        app2.doeMaarWat();

    }
}
