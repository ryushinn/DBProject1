package com.buaa.test.controller;


import com.buaa.test.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public String findAllPlayers(Model model) {
        model.addAttribute("players", playerService.findAllPlayers());
        return "players";
    }

    @GetMapping("/player")
    public String toAddPlayerPage(Model model) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 15; i <= 35; i++) {
            list.add(i);
        }
        model.addAttribute("ages", list);
        return "addPlayer";
    }

}
