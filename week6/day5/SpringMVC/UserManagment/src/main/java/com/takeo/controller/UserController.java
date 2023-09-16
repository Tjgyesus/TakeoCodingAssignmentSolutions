package com.takeo.controller;

import com.takeo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/")
    public String loadForm(Model model)
    {
        User user=new User();
        model.addAttribute("user", user);

        return "index";
    }

    @RequestMapping("/insert")
    public String handleForm(@ModelAttribute User user)
    {
        return "Display";
    }

}
