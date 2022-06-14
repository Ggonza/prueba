package com.gtd.prueba.services;

import com.gtd.prueba.model.user.User;
import com.gtd.prueba.views.userRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired private userRep repoUser;

    public List<User> listAll(){
        return (List<User>) repoUser.findAll();
    }
}
