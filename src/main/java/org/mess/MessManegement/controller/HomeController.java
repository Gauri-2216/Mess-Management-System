package org.mess.MessManegement.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mess.MessManegement.Model.candidate;
import org.mess.MessManegement.Model.loginModel;
import org.mess.MessManegement.Service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	loginService logService;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}

	@RequestMapping("log")
	public String Demo(){
		return "login";
	}
	@RequestMapping("reg")
	public String AdminLogin(loginModel lmodel,Map map)
	{
		boolean b=logService.isCheckAdmin(lmodel);
		
		if(b) {
			return "masterPage";
		}
		else {
			return "login";
		}
	}
	
	@RequestMapping("/addNewCandidate")
	public String newCandidate()
	{
		return "candidate";
	}
	
}
