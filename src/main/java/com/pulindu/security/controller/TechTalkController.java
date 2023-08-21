package com.pulindu.security.controller;

import com.pulindu.security.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tech")
public class TechTalkController {

    @GetMapping(path = "/public/greeting")
    public String greeting(){

        return "Hello curious developer!";
    }

    @GetMapping(path = "/public/part-ways")
    public String bye(){

        return "See you soon!";
    }

    @GetMapping(path = "/private/admins/sensitive-data")
    public Response sensitiveData(){
        return new Response(
                "Pulindu",
                "Pulindu@123"
        );
    }

    @GetMapping(path = "/private/users/user-data")
    public String userData(){
        return "These data can be accessed by an USER or an ADMIN";
    }

    @GetMapping(path = "/private/admins/admin-data")
    public String adminData(){
        return "These data can be only accessed by an ADMIN";
    }
}
