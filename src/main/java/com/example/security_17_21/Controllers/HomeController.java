package com.example.security_17_21.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
//	@RequestMapping("/admin")
//	public String admin()
//	{
//		return "admin";
//	}
	@RequestMapping("/secure")
	public String secure()
	{
		return "secure";
	}

}