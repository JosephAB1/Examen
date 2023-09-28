package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.ICarritoService;
import org.cibertec.edu.pe.modelo.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping
public class CarritoController {
	@Autowired
	private ICarritoService carrito;
	
	@GetMapping("/carrito")
	public String Carrito(Model m) {
		List<Carrito> lista = carrito.Listar();
		m.addAttribute("carrito", lista);
		return "carrito"; //productos.html
	}
	
}
