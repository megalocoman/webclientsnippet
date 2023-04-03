package com.cfjofre.webclientTutopokeApi;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class pokemonServiceController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping(value = "/pokemon/{nameNumberpokemon}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Pokemon> getPokemonController(@PathVariable String nameNumberpokemon) throws JSONException {

        return pokemonService.getPokemon(nameNumberpokemon);
    }


}
