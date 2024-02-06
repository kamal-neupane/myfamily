package com.example.familyinformation.controller;

import com.example.familyinformation.entity.FamilyMember;
import com.example.familyinformation.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/families")
public class FamilyController {
    private FamilyService familyService;


    @Autowired
    public FamilyController(FamilyService familyRepository) {
        this.familyService = familyRepository;
    }



    @GetMapping("/list")
    public String getAllFamily(Model model){
        List<FamilyMember> familyMembers = familyService.getAllFamily();
        model.addAttribute("familyMembers",familyMembers);
        return "families/family-list";
    }





    @GetMapping("/addFamily")
    public String addFamily(Model model){
        model.addAttribute("familyMember", new FamilyMember());
        return "families/familyAddForm";
    }


    @PostMapping("/saveFamily")
    public String saveFamily(@ModelAttribute("familyMember") FamilyMember familyMember){
        familyService.save(familyMember);
        return "redirect:/families/list";

    }

    @GetMapping("/updateFamily")
    public String updateFamily(@RequestParam("familyId") int id, Model model){
        FamilyMember theFamily = familyService.getFamilyMemberById(id);
        model.addAttribute("familyMember", theFamily);
        return "/families/familyAddForm";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("familyId") int id){
      familyService.delete(id);
        return "redirect:/families/list";
    }

}
