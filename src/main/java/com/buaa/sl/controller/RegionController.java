package com.buaa.sl.controller;


import com.buaa.sl.bean.Region;
import com.buaa.sl.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RegionController {
    @Autowired
    RegionService regionService;

    @GetMapping("/regions")
    public String findAllRegions(Model model) {
        List<Region> regions = regionService.findAllRegions();
        model.addAttribute("regions", regions);
        return "/region/regions";
    }

    @GetMapping("/region")
    public String toAddRegionPage(Model model) {
        return "/region/addRegion";
    }

    @PostMapping("/region")
    public String addRegion(Region region, Model model) {
        System.out.print(region.getRname());
        if (!checkValidity(region, model)) {
            return "/region/addRegion";
        }
        regionService.addRegion(region);
        return "/region/addRegion";
    }


    @DeleteMapping("/region/{id}")
    public String deleteRegion(@PathVariable("id") Integer regionId) {
        regionService.deleteRegion(regionId);
        return "redirect:/regions";
    }

    private boolean checkValidity(Region region, Model model) {
        boolean success = false;
        if (region.getRname().trim().equals("")) {
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
