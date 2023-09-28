package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.ICarritoService;
import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.modelo.Producto;
import org.cibertec.edu.pe.modelo.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping
public class ProductoController {
	@Autowired
	private IProductoService servicio;
	
	@Autowired
	private ICarritoService carritos;
	
	@GetMapping("/productos")
	public String Listado(Model m) {
		List<Producto> lista = servicio.Listar();
		m.addAttribute("productos", lista);
		return "productos"; //productos.html
	}
	
	
	@GetMapping("/compra")
	public String Carrito(Model m) {
		List<Carrito> carros = carritos.Listar();
		m.addAttribute("carrito", carros);
		return "carrito";
	}
	
}
