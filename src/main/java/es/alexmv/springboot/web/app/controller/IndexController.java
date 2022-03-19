package es.alexmv.springboot.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import es.alexmv.springboot.web.app.model.service.IMyService;

@Controller
public class IndexController {
	
	@Autowired
	@Qualifier("myService2")
	private IMyService myService;
	
	@GetMapping({"", "/", "/index"})
	public String index(Model model) {
		model.addAttribute("objeto", myService.operacion());
		return "index";
	}



	
}
