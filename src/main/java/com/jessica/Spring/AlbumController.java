package com.jessica.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepo;

    @RequestMapping(value="/albums", method=RequestMethod.GET)
    public String index(Model m) {

        //display them on the page
        m.addAttribute("albums", albumRepo.findAll());
        return "albums";
    }
}
