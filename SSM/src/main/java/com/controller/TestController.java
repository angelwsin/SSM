package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.LogTest;
import com.service.LogTestService;

@Controller
public class TestController {
	
	        @Autowired
	        private LogTestService logTestService;
	       @RequestMapping("/index")
	       public  String test(){
	    	   LogTest log = new LogTest();
	  		 log.setText(" log inf ");
	  		 logTestService.save(log);
	    	   return "index";
	       }

}
