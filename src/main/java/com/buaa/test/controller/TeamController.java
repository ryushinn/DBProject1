package com.buaa.test.controller;

import com.buaa.test.bean.Player;
import com.buaa.test.bean.Team;
import com.buaa.test.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/teams")
    public String findAllTeams(Model model) {
        model.addAttribute("teams", teamService.findAllTeams());
        return "/team/teams";
    }

    @GetMapping("/team")
    public String toAddPlayerPage() {
        return "/team/addTeam";
    }

    @PostMapping("/team")
    public String addPlayer(Team team, Model model) {
        if (!checkValidity(team, model)) {
            return "/team/addTeam";
        }
        teamService.addTeam(team);
        model.addAttribute("success", true);
        model.addAttribute("msg", "SUCCESS!");
        return "/team/addTeam";
    }

    @DeleteMapping("/team/{id}")
    public String deletePlayer(@PathVariable("id") Integer teamId) {
        teamService.deletePlayer(teamId);
        return "redirect:/teams";
    }

    @GetMapping("/team/{id}")
    public String toModifyPlayerPage(@PathVariable("id") Integer teamId, Model model) {
        model.addAttribute("mTeam", teamService.findTeam(teamId));
        return "/team/addTeam";
    }

    @PutMapping("/team")
    public String modifyPlayer(Team team, Model model) {
        if (!checkValidity(team, model)) {
            model.addAttribute("mTeam", team);
            return "/team/addTeam";
        }
        teamService.modifyTeam(team);
        model.addAttribute("success", true);
        model.addAttribute("msg", "SUCCESS!");
        model.addAttribute("mTeam", team);
        return "/team/addTeam";
    }

    @GetMapping("/team/retrievePage")
    public String toRetrievePage() {
        return "/team/retriTeam";
    }

    @GetMapping("/team/retrieve")
    public String retrievePlayers(Team condition, Model model) {
        if (!checkValidity(condition, model)) {
            return "/team/retriTeam";
        }
        model.addAttribute("teams", teamService.retrieveTeams(condition));
        return "/team/teams";
    }

    private boolean checkValidity(Team team, Model model) {
        String msg = null;
        boolean success = false;
        if (team.getTname().trim().isEmpty()) {
            msg = "Please fill your real name!";
        }
        else if (team.getRegion().trim().isEmpty()) {
            msg = "Please fill your game name!";
        }
        else {
            success = true;
        }
        model.addAttribute("msg", success ? "SUCCESS!" : msg);
        model.addAttribute("success", success);
        return success;
    }
}
