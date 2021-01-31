package io.github.andreepdias.ifood.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("about")
public class AboutController {

    @GetMapping
    public String get(){
        return "We are ready to work! :)";
    }

}
