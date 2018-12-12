package com.jessica.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlbumController {

    @RequestMapping(value="/albums", method=RequestMethod.GET)
    public String index(Model m) {
         //grab all the from the db
        Album[] albums = new Album[]{new Album("Jessica", "artist"), new Album("TITLE", "ARTIST")};
        //display them on the page
        m.addAttribute("albums", albums);
        return "albums";
    }
}
