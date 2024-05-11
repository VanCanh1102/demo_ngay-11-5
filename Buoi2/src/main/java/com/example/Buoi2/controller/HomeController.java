package com.example.Buoi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String about(Model model){
        model.addAttribute("name", "Nguyễn Văn Cảnh");
        model.addAttribute("job", "BackEnd Developer");
        model.addAttribute("aboutMe", "In the short term, my goal is to absorb as much knowledge and experience as possible from seasoned experts in the field of web development. \n" +
                "Long-term, my aim is to become a full-stack developer.");
        model.addAttribute("age", 21);
        model.addAttribute("residence", "VN");
        model.addAttribute("address","TP.HCM, VN");

        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("address","TP.HCM, VN");
        model.addAttribute("email","nvc11022003@gmail.com");
        model.addAttribute("phone","0971087826");
        return "contact";
    }

    @GetMapping("/resume")
    public String resume(Model model){
        model.addAttribute("date1","4/2024 - PRESENT");
        model.addAttribute("jobPosition1","BACKEND DEVELOPER");
        model.addAttribute("company1","NPS COMPANY");
        model.addAttribute("job1","Website design using asp.net core language");

        model.addAttribute("dateEdu","2021 - PRESENT");
        model.addAttribute("mainMajor","SOFTWARE ENGINEERING");
        model.addAttribute("nameEdu","HUTECH UNIVERSITY");
        model.addAttribute("achievements","Third prize in the contest \"I like BA\" organized by ITHutech (2023)." +
                "Students 5 merits: 2021 - 2022, 2022-2023." +
                "Leader of movement: \"TAP THE TIEN TIEN\" (2021 -2022, 2022-2023)" +
                "GPA: 3.50 / 4.0");
        return "resume";
    }
}
