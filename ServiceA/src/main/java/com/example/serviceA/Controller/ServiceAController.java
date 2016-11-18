/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviceA.Controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sgoswami
 */
@RestController
public class ServiceAController {
    
     private final Logger logger = LoggerFactory.getLogger(ServiceAController.class);  

    
   @RequestMapping(value = "/service1/sayhello", method = RequestMethod.GET)
    public String sayHello() {
        logger.info("sayHello() is called in service1");
        
        return "Hello From service1";
    } 
    
    
    
}