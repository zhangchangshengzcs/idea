package com.hgc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
    @RequestMapping("/helloNew")
    public String helloNew(){
        return "helloNew";
    }
}
