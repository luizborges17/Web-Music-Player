package com.example.webmusicplayer.controllers;

import com.example.webmusicplayer.services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final StorageService storageService;

    @Autowired
    public IndexController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping
    public String getHomePage(Model model){

        model.addAttribute("songFileNames",
                storageService.getSongFileName());

        return "index";
    }
}
