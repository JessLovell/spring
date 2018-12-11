package com.jessica.Spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapitalizeController {

    @RequestMapping ("/capitalize/{capitalize}")
    public String capitalize(@PathVariable String capitalize){
        return capitalize.toUpperCase();
    }
}
