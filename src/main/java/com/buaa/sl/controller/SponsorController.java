package com.buaa.sl.controller;

import com.buaa.sl.bean.Sponsor;
import com.buaa.sl.service.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SponsorController {

    @Autowired
    SponsorService sponsorService;

    @GetMapping("/sponsors")
    public String findAllSponsors(Model model) {
        List<Sponsor> sponsors = sponsorService.findAllSponsors();
        model.addAttribute("sponsors", sponsors);
        return "/sponsor/sponsors";
    }

    @GetMapping("/sponsor")
    public String toAddSponsorPage(Model model) {
        return "/sponsor/addSponsor";
    }

    @PostMapping("/sponsor")
    public String addSponsor(Sponsor sponsor, Model model) {
        if (!checkValidity(sponsor, model)) {
            return "/sponsor/addSponsor";
        }
        sponsorService.addSponsor(sponsor);
        return "/sponsor/addSponsor";
    }


    @DeleteMapping("/sponsor/{id}")
    public String deleteSponsor(@PathVariable("id") Integer sponsorId) {
        sponsorService.deleteSponsor(sponsorId);
        return "redirect:/sponsors";
    }

    private boolean checkValidity(Sponsor sponsor, Model model) {
        boolean success = false;
        if (sponsor.getName().trim().equals("")) {
            model.addAttribute("msg", "Please fill in your name");
        }
        else {
            model.addAttribute("msg", "SUCCESS!");
            success = true;
        }
        model.addAttribute("success", success);
        return success;
    }
}
