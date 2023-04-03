package com.cfjofre.webclientTutopokeApi;

import reactor.core.publisher.Mono;

public interface PokemonService {

   public Mono<Pokemon> getPokemon(String namenoPokemon);
}
