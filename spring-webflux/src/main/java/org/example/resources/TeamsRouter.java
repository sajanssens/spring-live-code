package org.example.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration(proxyBeanMethods = false)
public class TeamsRouter {
    @Bean
    public RouterFunction<ServerResponse> router(TeamsHandler h) {
        return RouterFunctions.route()
                .GET("/teams", h::all)
                .GET("/teams/{id}", h::one)
                .build();
    }
}
