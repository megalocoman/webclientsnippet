package com.cfjofre.webclientTutopokeApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class PokemonServiceImpl implements PokemonService{


    @Autowired
    private WebClient webClient;

//    public PokemonServiceImpl() {
//        this.webClient = WebClient.builder()
//                .baseUrl(POKEMON_API)
//                .build();
//    }

    @Override
    public Mono<Pokemon> getPokemon(String namePokemon) {


        return webClient.get()
                .uri("pokemon/"+namePokemon)
//                .accept(MediaType.APPLICATION_JSON)
                .retrieve()

                .bodyToMono(Pokemon.class);
    }
}
