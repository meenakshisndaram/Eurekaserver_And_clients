package meenakshi.sundaram.Eurekclient1_movie_Catalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hicontroller {
    @GetMapping
    public String hi(){
        return "hi";
    }
}
