/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviceB.service;


import com.example.serviceB.RestTemplateFactory.RestTemplateFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author sgoswami
 */
@Component
public class restCallerImpl implements restcallerService {
 private final Logger logger = LoggerFactory.getLogger(restCallerImpl.class);
    @Override
    public String restcaller() {
          RestTemplate restTemplate= RestTemplateFactory.getRestTemplate();
          
          final String uri = "http://localhost:1800/service1/sayhello";
     
        String result = restTemplate.getForObject(uri, String.class);
      
    logger.info("Rest call successful!! :- "+result);
    return result;
    }
    
}
