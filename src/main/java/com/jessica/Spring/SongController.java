package com.jessica.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    public SongRepository songRepo;

    @RequestMapping(value="/songs", method=RequestMethod.GET)
    public String index(Model m) {
        m.addAttribute("songs", songRepo.findAll());
        return "songs";
    }

    @RequestMapping(value="/songs", method=RequestMethod.POST)
    public RedirectView create(@RequestParam String title, @RequestParam int trackNum, @RequestParam double lengthInSeconds) {
        Song newSong = new Song(title, lengthInSeconds, trackNum);
        songRepo.save(newSong);
        return new RedirectView("/songs");
    }
}
