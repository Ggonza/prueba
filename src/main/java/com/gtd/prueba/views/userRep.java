package com.gtd.prueba.views;

import com.gtd.prueba.model.user.User;
import org.springframework.data.repository.CrudRepository;

public interface userRep extends CrudRepository <User, Integer> {

}
