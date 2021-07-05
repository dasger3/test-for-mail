package com.example.sweater.controller;

import com.example.sweater.service.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MessageController {

    @Autowired
    private MailSender mailSender;



    @GetMapping("/gree")
    public String greeting() {
        mailSender.send("voronalex67@gmail.com", "Activation code", "eeeeeee");
        return "greeting";
    }

}
