package com.plunder.mailcannon.util.controller;

import com.plunder.mailcannon.util.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;

@RestController
@RequestMapping("/plundercannon")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping(value = "/{id}")
    public MimeMessage findById(@PathVariable("id") Long id) {
        return RestPreconditions.checkFound(service.findById(id));
    }


}
