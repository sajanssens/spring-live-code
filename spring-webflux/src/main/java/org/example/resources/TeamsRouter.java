package org.example.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration(proxyBeanMethods = false)
public class TeamsRouter {

    @Bean
    public RouterFunction<ServerResponse> route(TeamsHandler h) {
        return RouterFunctions.route()
                .GET("/teams", r -> ok().body(fromValue(h.all())))
                .GET("/teams/{id}", h::one)
                .build();

        // .GET("/teams/{id}"),accept(APPLICATION_JSON), h::one)
    }
}
