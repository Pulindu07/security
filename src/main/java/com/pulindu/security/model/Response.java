package com.pulindu.security.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {

    @JsonProperty("name")
    private String name;

    @JsonProperty("masterPassword")
    private String password;
}
