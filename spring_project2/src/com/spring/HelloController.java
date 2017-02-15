package com.spring;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.portlet.ModelAndView;

import com.service.register_service;

import Registerbean.registerbean;

@Controller
public class HelloController {
	//private String file;
	private String saveDirectory="/home/sandeep/SpringProjects/";
@RequestMapping(value= "/", method=RequestMethod.GET)
public String init(Model model)
{
	model.addAttribute("msg", "Please Enter Your Login Details");
	return "register";
	
}
@RequestMapping(value= "/save", method=RequestMethod.POST )
public String init(Model model,@ModelAttribute("regbean") registerbean regbean,@RequestParam CommonsMultipartFile file,HttpSession session)
{
	String filename=file.getOriginalFilename();
	System.out.println(saveDirectory + " " + filename);
	try
	{
		byte barr[]=file.getBytes();
		BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(saveDirectory+"/"+filename));
		bout.write(barr);
		bout.flush();
		bout.close();
	}
	catch (Exception e) 
	{
		System.out.println(e);
		// TODO: handle exception
	}
	//return new ModelAndView("upload-success","filename",saveDirectory+"/"+filename);
	boolean rt=false;
	register_service regs=new register_service();
	regbean.setFilename(filename);
	rt=regs.insertdata(regbean);
	System.out.println(rt);
	if(rt==false)
	{
		model.addAttribute("name", regbean.getFname());
		model.addAttribute("names", regbean.getLname());
		model.addAttribute("gender", regbean.getGen());
		model.addAttribute("date", regbean.getDob());
		model.addAttribute("email", regbean.getEmail());
		model.addAttribute("username", regbean.getUname());
		model.addAttribute("password", regbean.getPswd());
		model.addAttribute("files", regbean.getFilename());
		System.out.println("Hai");
		return "success";
	}
	else
	{
		System.out.println("Hello");
		return "register";
	}
	
	
}

}
