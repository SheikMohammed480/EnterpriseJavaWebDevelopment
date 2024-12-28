package com.ModelViewControl.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {
	@GetMapping("/hello")
	public String showPage(Model model)
	{
		model.addAttribute("title", "welcome");
		model.addAttribute("about","this is mvc ");
		return "hello";
	}

}
