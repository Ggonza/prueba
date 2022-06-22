package com.gtd.prueba.controller;

import com.gtd.prueba.model.user.User;
import com.gtd.prueba.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class userController {
    @Autowired private userService service;

    @GetMapping("/gestionUsuarios")
    public String showMain(){
        return "gestionUsuarios/baseAdm";
    }

    @GetMapping("/gestionUsuarios/Listados")
    public String showUserList(Model model){
        List<User> listUsers = service.listAll();
        model.addAttribute("listUsers", listUsers);
        return "gestionUsuarios/userList/U_List";
    }
}
