package com.virtualcave.exercise.one.springbootexercice1.controllers;

import com.virtualcave.exercise.one.springbootexercice1.entities.Tax;
import com.virtualcave.exercise.one.springbootexercice1.repositories.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@Controller
@RequestMapping(path="/")
public class MainController {

    @Autowired
    private TaxRepository taxRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Tax> getAllSubscriptions() {
        return taxRepository.findAll();
    }

    @GetMapping("/addtax")
    public String addTax() {

        Tax tax = new Tax(3,3,new Date(),new Date(),1234,"CAD");
        taxRepository.save(tax);

        return "success";
    }

    @PostMapping(path="/deleteAll")
    public void deleteAllSubscriptions() {
        taxRepository.deleteAll();
    }

}