package com.cfjofre.webclientTutopokeApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {

    private String name;
    private int id;
    private Object forms;
    private Object abilities;

}
