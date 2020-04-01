package com.Hackathon_LeaderBoard.controller;

import com.Hackathon_LeaderBoard.model.Recruit;
import com.Hackathon_LeaderBoard.model.Login;
import com.Hackathon_LeaderBoard.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    public RecruitService recruitService;

    @GetMapping("/")
    public String home(Map<String, Object> map) {
        return "home";
    }

    @GetMapping("/showLoginPage")
    public String showLoginPage(ModelMap model) {
        model.addAttribute(new Login());

        return "login";
    }
}
