package kr.co.ensmart.frameworkdemo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.ensmart.frameworkdemo.app.service.SampleService;

@Controller
@RequestMapping("/sample")
public class SampleController {
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("")
	public String viewMain() {
		sampleService.viewMain();
		return "main";
	}
}
