package com.gtd.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/inicio")
    public String mostrarLanding(){
        return "index";
    }
    @GetMapping("/planes")
    public String viewPlans(){
        return "landing/planes";
    }
}
