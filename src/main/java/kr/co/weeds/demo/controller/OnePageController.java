package kr.co.weeds.demo.controller;

import org.springframework.stereotype.Controller;


@Controller("/")
public class OnePageController {
	
	public String main()
	{
		return "index";
	}

}
