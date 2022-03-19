package es.alexmv.springboot.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.alexmv.springboot.web.app.model.entity.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {
	
	@Autowired
	private Factura factura;

	@GetMapping("/ver")
	public String ver(Model model) {
		
		model.addAttribute("titulo", "Ejemplo factura con inyeccion de depdendencias");
		model.addAttribute("factura", factura);

		return "factura/ver";
	}
}
