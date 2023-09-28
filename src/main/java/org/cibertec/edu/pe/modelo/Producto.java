package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;



@Entity
@Table(name="productos")
public class Producto {

	@Id
	public int id;
	public String articulo;
	public String img;
	public String descripcion;
	public int precio;
	

	public Producto() {
		
		
	}
	
	
	public Producto(int id, String articulo, String img, String descripcion, int precio) {
		super();
		this.id = id;
		this.articulo = articulo;
		this.img = img;
		this.descripcion = descripcion;
		this.precio = precio;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
