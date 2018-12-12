package com.jessica.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

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

    @RequestMapping(value="/albums", method=RequestMethod.POST)
    public RedirectView create(@RequestParam String title, @RequestParam String artist,
    @RequestParam int songCount, @RequestParam double lengthInSeconds, @RequestParam String imageURL){

        Album newAlbum = new Album(title, artist, songCount, lengthInSeconds, imageURL);
        albumRepo.save(newAlbum);
        return new RedirectView("/albums");
    }
}
