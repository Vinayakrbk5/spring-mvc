package com.xworkz.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spring.dto.CalamityDTO;
import com.xworkz.spring.service.CalamityService;

@Component
@RequestMapping("/")
public class CalamityController {
	@Autowired
	private CalamityService calService;

	public CalamityController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("/welcome.do")
	public String message(CalamityDTO dto, Model model) {
		System.out.println("invoked message() method");
		System.out.println(dto);
		boolean check=this.calService.validateAndSave(dto);
		if (check==true) {
			System.out.println("Sending response to success.jsp");
			model.addAttribute("dtoClass", dto);
			return "success";
		} else {
			System.out.println("sending response to welcome.jsp");
			model.addAttribute("valid", "Some fields are missing, so enter the details again");
			return "welcome";
		}

	}

}
