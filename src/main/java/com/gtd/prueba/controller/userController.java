package com.gtd.prueba.controller;

import com.gtd.prueba.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class userController {
    @Autowired private userService service;


}
