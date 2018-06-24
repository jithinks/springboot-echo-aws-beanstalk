package com.jks.startup.springbootecho.controller;

import com.jks.startup.springbootecho.service.EchoService;
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
    EchoService echoService;

   @GetMapping("/")
    public String echo(){
       return echoService.getEchoUsers("Someone");
    }

    //http://localhost:5050/jithin/
    @GetMapping("/{something}")
    public String echoResponse(@PathVariable String something){
        return echoService.getEchoUsers(something);
    }
}
