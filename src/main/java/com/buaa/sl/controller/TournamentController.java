package com.buaa.sl.controller;

import com.buaa.sl.bean.Tournament;
import com.buaa.sl.service.TournamentService;
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
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;
    @Autowired
    private TeamService teamService;
    @Autowired
    private RegionService regionService;

    @GetMapping("/tournaments")
    public String findAllTournaments(Model model) {
        List<Tournament> tournaments = tournamentService.findAllTournaments();
        model.addAttribute("tournaments", tournaments);
        return "/tournament/tournaments";
    }

    @GetMapping("/tournament")
    public String toAddTournamentPage(Model model) {
        model.addAttribute("regions", regionService.findAllRegions());
        model.addAttribute("teams", teamService.findAllTeams());
        return "/tournament/addTournament";
    }

    @PostMapping("/tournament")
    public String addTournament(Tournament tournament, Model model) {
        if (checkValidity(tournament, model)) {
            tournamentService.addTournament(tournament);
        }
        model.addAttribute("regions", regionService.findAllRegions());
        model.addAttribute("teams", teamService.findAllTeams());
        return "/tournament/addTournament";
    }

    @DeleteMapping("/tournament/{id}")
    public String deleteTournament(@PathVariable("id") Integer tournamentId) {
        tournamentService.deleteTournament(tournamentId);
        return "redirect:/tournaments";
    }

    @GetMapping("/tournament/{id}")
    public String toModifyTournamentPage(@PathVariable("id") Integer tournamentId, Model model) {
        model.addAttribute("mTournament", tournamentService.findTournament(tournamentId));
        model.addAttribute("regions", regionService.findAllRegions());
        model.addAttribute("teams", teamService.findAllTeams());
        return "/tournament/addTournament";
    }

    @PutMapping("/tournament")
    public String modifyTournament(Tournament tournament, Model model) {
        if (checkValidity(tournament, model)) {
            tournamentService.modifyTournament(tournament);
        }
        model.addAttribute("mTournament", tournament);
        model.addAttribute("regions", regionService.findAllRegions());
        model.addAttribute("teams", teamService.findAllTeams());
        return "/tournament/addTournament";
    }

    @GetMapping("/tournament/retrievePage")
    public String toRetrievePage(Model model) {
        model.addAttribute("regions", regionService.findAllRegions());
        model.addAttribute("teams", teamService.findAllTeams());
        return "/tournament/retriTournament";
    }

    @GetMapping("/tournament/retrieve")
    public String retrieveTournaments(Tournament condition, Model model) {
        List<Tournament> tournaments = tournamentService.retrieveTournaments(condition);
        model.addAttribute("tournaments", tournaments);
        return "/tournament/tournaments";
    }

    private Boolean checkValidity(Tournament tournament, Model model) {
        String msg = null;
        boolean success = false;
        if (tournament.getName().isEmpty()) {
            msg = "Please fill the name!";
        }
        else if (tournament.getChampion() == -1) {
            msg = "Please choose champion team!";
        }
        else if (tournament.getRunnerUp() == -1) {
            msg = "Please choose runner-up team!";
        }
        else if (tournament.getDate().toString().isEmpty()) {
            msg = "Please fill the date!";
        }
        else if (tournament.getLocation().isEmpty()) {
            msg = "Please fill the location!";
        }
        else if (tournament.getIn() == -1) {
            msg = "Please choose region!";
        }
        else if (tournament.getNumOfTeams() == 0) {
            msg = "Please fill the number of teams!";
        }
        else if (tournament.getPrize() == 0.0) {
            msg = "Please fill the prize";
        }
        else if (tournament.getSponsoredBy() == -1) {
            msg = "Please choose sponsor!";
        }
        else {
            success = true;
        }
        model.addAttribute("msg", success ? "SUCCESS!" : msg);
        model.addAttribute("success", success);
        return success;
    }
}
