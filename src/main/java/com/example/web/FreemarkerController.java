package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class FreemarkerController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","hello pillar");
        return "index";
    }
}