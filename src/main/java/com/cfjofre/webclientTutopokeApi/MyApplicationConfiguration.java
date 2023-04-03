package com.cfjofre.webclientTutopokeApi;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class MyApplicationConfiguration {

    private static final String  POKEMON_API = "https://pokeapi.co/api/v2/";
    private static final String API_MIME_TYPE = "application/json";


    @Bean
    public WebClient myWebClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder
                .baseUrl(POKEMON_API)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, API_MIME_TYPE)
//                .defaultHeader(HttpHeaders.USER_AGENT, USER_AGENT)
                .build();
    }
}
