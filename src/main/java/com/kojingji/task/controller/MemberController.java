package com.kojingji.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kojingji.task.models.Member;
import com.kojingji.task.service.intf.MemberService;
 @Controller
 @RequestMapping("/member")
 public class MemberController {
     
	 @Autowired
	 private MemberService memberService;
     
    
 
     @RequestMapping("/showMember")
     public String showUser(Model model){
         Member member=memberService.getMemberById("123123");
         model.addAttribute("member", member);
         return "index";
     }
     
     @RequestMapping("/login")
     public String login(Model model){
         Member member=memberService.getMemberById("123123");
         model.addAttribute("member", member);
         return "login";
     }

 }
 
