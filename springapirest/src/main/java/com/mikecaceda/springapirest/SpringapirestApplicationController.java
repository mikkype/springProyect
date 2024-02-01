package com.mikecaceda.springapirest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SpringapirestApplicationController {

    @RequestMapping("/app")
    
    public String hello(){
        return "hola mundo";
    }
    
}
