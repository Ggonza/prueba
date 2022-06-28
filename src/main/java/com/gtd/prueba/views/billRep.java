package com.gtd.prueba.views;


import com.gtd.prueba.model.bill.Bill;
import org.springframework.data.repository.CrudRepository;


public interface billRep extends CrudRepository <Bill,Integer> {
}
