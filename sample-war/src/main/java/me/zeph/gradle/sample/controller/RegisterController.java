package me.zeph.gradle.sample.controller;

import me.zeph.gradle.sample.model.Register;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class RegisterController {

	public static final String SAMPLE_REGISTER = "sample-register";
	public static final String SAMPLE_REGISTER_SUCCESS = "sample-register-success";
	public static final String PATH = "register";

	@RequestMapping(value = PATH, method = GET)
	public String view(Register register) {
		return SAMPLE_REGISTER;
	}

	@RequestMapping(value = PATH, method = POST)
	public String register(Model model, Register register) {
		model.addAttribute("username", register.getUsername());
		return SAMPLE_REGISTER_SUCCESS;
	}
}
