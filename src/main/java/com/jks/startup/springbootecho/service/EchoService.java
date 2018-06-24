package com.jks.startup.springbootecho.service;

import com.jks.startup.springbootecho.jpa.EchoRepo;
import com.jks.startup.springbootecho.model.EchoUser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EchoService {

    private static final Logger logger = Logger.getLogger(EchoService.class);

    @Autowired
    EchoRepo echoRepo;

    public String getEchoUsers(String something){

        EchoUser e = new EchoUser();
        e.setName(something);
        echoRepo.saveAndFlush(e);

        List l = echoRepo.findAll();
        logger.info(l);
        return "Hello "+e.getName()+" !!             Total visitors: "+l.size();
    }
}
