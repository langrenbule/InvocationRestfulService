package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: Invocation
 * Author: Sendya <18x@loacg.com>
 * Time: 8/18/2016 11:11 AM
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!!";
    }
}
