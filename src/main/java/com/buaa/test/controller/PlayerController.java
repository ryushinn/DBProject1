package com.buaa.test.controller;


import com.buaa.test.bean.Player;
import com.buaa.test.bean.Team;
import com.buaa.test.service.PlayerService;
import com.buaa.test.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;
    @Autowired
    private TeamService teamService;

    @GetMapping("/players")
    public String findAllPlayers(Model model) {
        List<Player> players = playerService.findAllPlayers();
        List<Team> teams = new ArrayList<>();
        model.addAttribute("players", players);
        for (Player player: players) {
            teams.add(teamService.findTeam(player.getBelong()));
        }
        model.addAttribute("teams", teams);
        return "/player/players";
    }

    @GetMapping("/player")
    public String toAddPlayerPage(Model model) {
        model.addAttribute("teams", teamService.findAllTeams());
        return "/player/addPlayer";
    }

    @PostMapping("/player")
    public String addPlayer(Player player, Model model) {
        if (!checkValidity(player, model)) {
            model.addAttribute("teams", teamService.findAllTeams());
            return "/player/addPlayer";
        }
        playerService.addPlayer(player);
        model.addAttribute("success", true);
        model.addAttribute("msg", "SUCCESS!");
        model.addAttribute("teams", teamService.findAllTeams());
        return "/player/addPlayer";
    }

    @DeleteMapping("/player/{id}")
    public String deletePlayer(@PathVariable("id") Integer playerId) {
        playerService.deletePlayer(playerId);
        return "redirect:/players";
    }

    @GetMapping("/player/{id}")
    public String toModifyPlayerPage(@PathVariable("id") Integer playerId, Model model) {
        model.addAttribute("mPlayer", playerService.findPlayer(playerId));
        model.addAttribute("teams", teamService.findAllTeams());
        return "/player/addPlayer";
    }

    @PutMapping("/player")
    public String modifyPlayer(Player player, Model model) {
        if (!checkValidity(player, model)) {
            model.addAttribute("mPlayer", player);
            model.addAttribute("teams", teamService.findAllTeams());
            return "/player/addPlayer";
        }
        playerService.modifyPlayer(player);
        model.addAttribute("success", true);
        model.addAttribute("msg", "SUCCESS!");
        model.addAttribute("mPlayer", player);
        model.addAttribute("teams", teamService.findAllTeams());
        return "/player/addPlayer";
    }

    @GetMapping("/player/retrievePage")
    public String toRetrievePage(Model model) {
        model.addAttribute("teams", teamService.findAllTeams());
        return "/player/retriPlayer";
    }

    @GetMapping("/player/retrieve")
    public String retrievePlayers(Player condition, Model model) {
        if (!checkValidity(condition, model)) {
            model.addAttribute("teams", teamService.findAllTeams());
            return "/player/retriPlayer";
        }
        List<Player> players = playerService.retrievePlayers(condition);
        model.addAttribute("players", players);
        List<Team> teams = new ArrayList<>();
        model.addAttribute("players", players);
        for (Player player: players) {
            teams.add(teamService.findTeam(player.getBelong()));
        }
        model.addAttribute("teams", teams);
        return "/player/players";
    }

    private Boolean checkValidity(Player player, Model model) {
        String msg = null;
        boolean success = false;
        if (player.getName().trim().isEmpty()) {
            msg = "Please fill your real name!";
        }
        else if (player.getGameName().trim().isEmpty()) {
            msg = "Please fill your game name!";
        }
        else if (player.getAge() == -1) {
            msg = "Please choose your age!";
        }
        else if (player.getPosition() == 0) {
            msg = "Please choose your position!";
        }
        else if (player.getBelong() == -1) {
            msg = "Please choose your team!";
        }
        else {
            success = true;
        }
        model.addAttribute("msg", success ? "SUCCESS!" : msg);
        model.addAttribute("success", success);
        return success;
    }
}
