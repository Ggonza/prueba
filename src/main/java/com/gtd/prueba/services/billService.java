package com.gtd.prueba.services;

import com.gtd.prueba.model.bill.Bill;
import com.gtd.prueba.model.user.User;
import com.gtd.prueba.views.billRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class billService {
    @Autowired private billRep repoBill;

    public List<Bill> listAll(){
        return (List<Bill>) repoBill.findAll();
    }

    public void save(Bill bill) {
        repoBill.save(bill);
    }
}
