package com.gazgeek.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
#hello
@RestController
public class HomeController {

    @RequestMapping("/")
    String home() {
        return "Hello from GazGeek!";
    }

}
