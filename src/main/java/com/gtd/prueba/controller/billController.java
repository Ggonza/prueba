package com.gtd.prueba.controller;


import com.gtd.prueba.model.bill.Bill;
import com.gtd.prueba.services.billService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class billController {
    @Autowired private billService Bservice;


    @GetMapping("/Facturacion")
    public String showBill(){
        return "clienteView/Billing/facturacion";
    }

    @PostMapping("/bill/guardar")
    public String saveBill(Bill bill){
        Bservice.save(bill);
        return "redirect:/index";
    }

}
