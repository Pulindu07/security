package com.pulindu.security.controller;

import com.pulindu.security.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tech")
public class TechTalkController {

    @GetMapping(path = "/greeting")
    public String greeting(){
        return "Hello curious developer!";
    }

    @GetMapping(path = "/part-ways")
    public String bye(){
        return "See you soon!";
    }

    @GetMapping(path = "/sensitive-data")
    public Response sensitiveData(){
        return new Response(
                "Pulindu",
                "Pulindu@123"
        );
    }
}