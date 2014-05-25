package me.zeph.gradle.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class SampleController {

	public static final String PATH = "index";
	public static final String VIEW_NAME = "sample-index";

	@RequestMapping(value = PATH, method = GET)
	public String view() {
		return VIEW_NAME;
	}
}
