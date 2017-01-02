package com.kojingji.task.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kojingji.task.service.intf.RegistrationService;
 @Controller
 @RequestMapping("/registration")
 public class RegistrationController {
     
	 @Autowired
	 private RegistrationService registrationService;
     
    
 
     @RequestMapping("/register")
     public Map<String,Object> showUser(String qqId,Long tId,Model model){
    	 Map<String,Object> retMap = new HashMap<String,Object>();
    	 boolean result=false;
    	 try {
    		 result = registrationService.saveRegistration(tId, qqId);
		} catch (Exception e) {
			System.out.println("错误信息["+e.getMessage()+"]");
			retMap.put("message", e.getMessage());
		}
		retMap.put("sucess", result);
        return retMap;
     }
 
 }
 
