package com.jks.startup.springbootecho.controller;

import com.jks.startup.springbootecho.jpa.EchoRepo;
import com.jks.startup.springbootecho.model.EchoUser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EchoController {

    private static final Logger logger = Logger.getLogger(EchoController.class);

    @Autowired
    EchoRepo echoRepo;

    //http://localhost:5050/jithin/
    @GetMapping("/{something}")
    public String echoResponse(@PathVariable String something){
        EchoUser e = new EchoUser();
        e.setName(something);
        echoRepo.saveAndFlush(e);

        List l = echoRepo.findAll();
        logger.info(l);
        return "Hello "+something+" !!             Total visitors: "+l.size();
    }
}
