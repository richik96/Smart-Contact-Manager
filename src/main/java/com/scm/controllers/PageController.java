package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page handler");

        //sending data to view
        model.addAttribute("name", "Richik");
        model.addAttribute("githubRepo", "https://github.com/richik96");
        model.addAttribute("service", "services.html");
        return "home";
    }

    //about route
    @RequestMapping("/about")
    public String aboutpage(Model model) {
        System.out.println("About Page handler");

        //sending data to view
        model.addAttribute("name", "Richik");
        return "about";
    }

    //services
    @RequestMapping("/services")
    public String servicespage(Model model) {
        System.out.println("Services Page handler");

        //sending data to view
        model.addAttribute("name", "Richik");
        return "services";
    }
}
