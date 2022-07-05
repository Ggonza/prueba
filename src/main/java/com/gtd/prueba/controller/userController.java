package com.gtd.prueba.controller;

import com.gtd.prueba.model.user.User;
import com.gtd.prueba.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/user")
public class userController {
    @Autowired private userService service;

    @GetMapping("/Login")
    public String showLanding(){
        return "index";
    }

    @GetMapping("/mainView")
    public String showMain(){
        return "mainView/gestionMain";
    }

    @GetMapping("/gestionUsuarios/Listados")
    public String showUserList(Model model){
        List<User> listUsers = service.listAll();
        model.addAttribute("listUsers", listUsers);
        return "clienteView/userList/U_List";
    }


//    @GetMapping("/facturacion")
//    public String billingView(){
//        return "clienteView/Billing/facturacion";
//    }
}
