package com.example.serviceB.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.serviceB.service.restcallerService;
/**
 *
 * @author sgoswami
 */
@RestController
public class Controller {
    
     private final Logger logger = LoggerFactory.getLogger(Controller.class);


    @Autowired
    private restcallerService restcaller;
   
  
   @RequestMapping(value = "/testservicecall", method = RequestMethod.GET)
    public String sayHello() {
        logger.info("sayHello() is called from Service 2");
        String res=restcaller.restcaller();
        return res+"Hello From service2";
    } 
    
    
    
}
