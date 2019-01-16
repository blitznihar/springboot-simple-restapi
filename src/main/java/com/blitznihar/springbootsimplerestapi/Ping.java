package com.blitznihar.springbootsimplerestapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {

	    @RequestMapping("/ping")
	    public String ping(@RequestParam(value="bounce", defaultValue="") String bounce) {
	        String response = java.time.LocalDateTime.now().toString();
	        if(bounce!=null)
	        	response = bounce + "@"+response;
	        return response;
	    }
	
}
