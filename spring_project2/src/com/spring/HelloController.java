package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.register_service;

import Registerbean.registerbean;

@Controller
public class HelloController {
@RequestMapping(value= "/", method=RequestMethod.GET)
public String init(Model model)
{
	model.addAttribute("msg", "Please Enter Your Login Details");
	return "register";
	
}
@RequestMapping(value= "/save", method=RequestMethod.POST )
public String init(Model model,@ModelAttribute("regbean") registerbean regbean)
{
	int rt=-1;
	register_service regs=new register_service();
	rt=regs.insertdata(regbean);
	if(rt==1){
		model.addAttribute("name", regbean.getFname());
		model.addAttribute("names", regbean.getLname());
		model.addAttribute("gender", regbean.getGen());
		model.addAttribute("date", regbean.getDob());
		model.addAttribute("email", regbean.getEmail());
		model.addAttribute("username", regbean.getUname());
		model.addAttribute("password", regbean.getPswd());
		model.addAttribute("files", regbean.getFile());
		return "success";
	}
	else
	{
		return "register";
	}
	
	
}
}
