package com.buaa.sl.controller;

import com.buaa.sl.bean.Competition;
import com.buaa.sl.service.CompetitionService;
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

import java.util.List;

@Controller
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;
    @Autowired
    private TeamService teamService;
    @Autowired
    private RegionService regionService;

    @GetMapping("/competitions")
    public String findAllCompetitions(Model model) {
        List<Competition> competitions = competitionService.findAllCompetitions();
        model.addAttribute("competitions", competitions);
        return "/competition/competitions";
    }

    @GetMapping("/competition")
    public String toAddCompetitionPage(Model model) {
        model.addAttribute("regions", regionService.findAllRegions());
        model.addAttribute("teams", teamService.findAllTeams());
        return "/competition/addCompetition";
    }

    @PostMapping("/competition")
    public String addCompetition(Competition competition, Model model) {
        if (checkValidity(competition, model)) {
            competitionService.addCompetition(competition);
        }
        model.addAttribute("regions", regionService.findAllRegions());
        model.addAttribute("teams", teamService.findAllTeams());
        return "/competition/addCompetition";
    }

    @DeleteMapping("/competition/{id}")
    public String deleteCompetition(@PathVariable("id") Integer competitionId) {
        competitionService.deleteCompetition(competitionId);
        return "redirect:/competitions";
    }

    @GetMapping("/competition/{id}")
    public String toModifyCompetitionPage(@PathVariable("id") Integer competitionId, Model model) {
        model.addAttribute("mCompetition", competitionService.findCompetition(competitionId));
        model.addAttribute("regions", regionService.findAllRegions());
        model.addAttribute("teams", teamService.findAllTeams());
        return "/competition/addCompetition";
    }

    @PutMapping("/competition")
    public String modifyCompetition(Competition competition, Model model) {
        if (checkValidity(competition, model)) {
            competitionService.modifyCompetition(competition);
        }
        model.addAttribute("mCompetition", competition);
        model.addAttribute("regions", regionService.findAllRegions());
        model.addAttribute("teams", teamService.findAllTeams());
        return "/competition/addCompetition";
    }

    @GetMapping("/competition/retrievePage")
    public String toRetrievePage(Model model) {
        model.addAttribute("regions", regionService.findAllRegions());
        model.addAttribute("teams", teamService.findAllTeams());
        return "/competition/retriCompetition";
    }

    @GetMapping("/competition/retrieve")
    public String retrieveCompetitions(Competition condition, Model model) {
        List<Competition> competitions = competitionService.retrieveCompetitions(condition);
        model.addAttribute("competitions", competitions);
        return "/competition/competitions";
    }

    private Boolean checkValidity(Competition competition, Model model) {
        String msg = null;
        boolean success = false;
        if (competition.getFrom() == -1) {
            msg = "Please fill the region!";
        }
        else if (competition.getDire() == -1) {
            msg = "Please choose dire team!";
        }
        else if (competition.getRadiant() == -1) {
            msg = "Please choose radiant team!";
        }
        else if (competition.getDate().toString().isEmpty()) {
            msg = "Please fill the date!";
        }
        else if (competition.getDuration() == 0.0) {
            msg = "Please fill the duration!";
        }
        else if (competition.getDireKills() == null) {
            msg = "Please fill the dire's kills!";
        }
        else if (competition.getRadiantKills() == null) {
            msg = "Please fill the radiant's kills!";
        }
        else {
            success = true;
        }
        model.addAttribute("msg", success ? "SUCCESS!" : msg);
        model.addAttribute("success", success);
        return success;
    }
}
