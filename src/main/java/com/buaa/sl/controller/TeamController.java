package com.buaa.sl.controller;

import com.buaa.sl.bean.Team;
import com.buaa.sl.service.RegionService;
import com.buaa.sl.service.TeamService;
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
    @Autowired
    private RegionService regionService;

    @GetMapping("/teams")
    public String findAllTeams(Model model) {
        model.addAttribute("teams", teamService.findAllTeams());
        return "/team/teams";
    }

    @GetMapping("/team")
    public String toAddTeamPage(Model model) {
        model.addAttribute("regions", regionService.findAllRegions());
        return "/team/addTeam";
    }

    @PostMapping("/team")
    public String addTeam(Team team, Model model) {
        if (!checkValidity(team, model)) {
            model.addAttribute("regions", regionService.findAllRegions());
            return "/team/addTeam";
        }
        teamService.addTeam(team);
        model.addAttribute("regions", regionService.findAllRegions());
        return "/team/addTeam";
    }

    @DeleteMapping("/team/{id}")
    public String deleteTeam(@PathVariable("id") Integer teamId) {
        teamService.deletePlayer(teamId);
        return "redirect:/teams";
    }

    @GetMapping("/team/{id}")
    public String toModifyTeamPage(@PathVariable("id") Integer teamId, Model model) {
        model.addAttribute("mTeam", teamService.findTeam(teamId));
        model.addAttribute("regions", regionService.findAllRegions());
        return "/team/addTeam";
    }

    @PutMapping("/team")
    public String modifyTeam(Team team, Model model) {
        if (!checkValidity(team, model)) {
            model.addAttribute("mTeam", team);
            model.addAttribute("regions", regionService.findAllRegions());
            return "/team/addTeam";
        }
        teamService.modifyTeam(team);
        model.addAttribute("mTeam", team);
        model.addAttribute("regions", regionService.findAllRegions());
        return "/team/addTeam";
    }

    @GetMapping("/team/retrievePage")
    public String toRetrievePage(Model model) {
        model.addAttribute("regions", regionService.findAllRegions());
        return "/team/retriTeam";
    }

    @GetMapping("/team/retrieve")
    public String retrieveTeams(Team condition, Model model) {
        model.addAttribute("teams", teamService.retrieveTeams(condition));
        return "/team/teams";
    }

    private boolean checkValidity(Team team, Model model) {
        String msg = null;
        boolean success = false;
        if (team.getTname().trim().isEmpty()) {
            msg = "Please fill your team name!";
        }
        else if (team.getIn() == -2) {
            msg = "Please choose your region!";
        }
        else {
            success = true;
        }
        model.addAttribute("msg", success ? "SUCCESS!" : msg);
        model.addAttribute("success", success);
        return success;
    }
}
