package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.Producto;



public interface IProductoService  {
	public List<Producto> Listar();
	public Optional<Producto> Buscar(String id);
	public int Grabar(Producto ObjC);
	public void Eliminar(String id);
}
