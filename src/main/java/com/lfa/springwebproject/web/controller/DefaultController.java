/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.springwebproject.web.controller;

import com.lfa.springwebproject.entity.Client;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ssubik
 */
@Controller
@RequestMapping(value = "/home")
public class DefaultController {
    @Autowired
    private SessionFactory sessionFactory;
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        Session session = sessionFactory.openSession();
        List<Client> clients = session.createQuery("select c from Client c").list();
        model.addAttribute("clients", clients);
        return "home/index";
    }
}
