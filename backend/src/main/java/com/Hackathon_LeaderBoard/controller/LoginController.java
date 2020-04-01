package com.Hackathon_LeaderBoard.controller;

import com.Hackathon_LeaderBoard.model.Recruit;
import com.Hackathon_LeaderBoard.model.Login;
import com.Hackathon_LeaderBoard.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    public RecruitService recruitService;

    @PostMapping(value = "/loginProcess")
    public String login(@ModelAttribute("login") Login login, BindingResult bindingResult, ModelMap model) {

        Recruit recruit = recruitService.validateRecruit(login);

        boolean isValidUser = false;

        if (null != recruit && recruit.getUsername().equals(login.getUsername())
                && recruit.getPassword().equals(login.getPassword())) {
            isValidUser = true;
            model.addAttribute("username", recruit.getUsername());
        }

        return isValidUser ? "welcome" : "login";
    }
}