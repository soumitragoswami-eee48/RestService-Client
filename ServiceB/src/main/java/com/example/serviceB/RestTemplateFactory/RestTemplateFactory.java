/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviceB.RestTemplateFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author sgoswami
 */

public class RestTemplateFactory {
   @Bean
   public static RestTemplate getRestTemplate() {
		RestTemplate template = new RestTemplate();
		
		return template;
	}
    
}
