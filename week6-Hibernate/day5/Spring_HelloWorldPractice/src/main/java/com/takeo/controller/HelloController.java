package com.takeo.controller;

import com.takeo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";

    }
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String user(@Validated User user, Model model){
        System.out.println("User Page Requested");
        model.addAttribute("userName", user.getUserName());
        return "welcome";

    }

}
