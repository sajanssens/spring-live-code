package org.example.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static java.lang.Long.parseLong;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration(proxyBeanMethods = false)
public class TeamsRouter {

    @Bean
    public RouterFunction<ServerResponse> route(TeamsHandler h) {
        return RouterFunctions
                .route(GET("/teams/{id}").and(accept(APPLICATION_JSON)),
                        rq -> ok().contentType(APPLICATION_JSON)
                                .body(fromValue(h.one(parseLong(rq.pathVariable("id")))))
                );
    }
}
