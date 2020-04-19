package org.servicios.examenej;

import java.io.Serializable;


public class DTOArticulos implements Serializable {

	private int id;
	private int tipo;
	private String descripcion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public DTOArticulos (int id, int tipo, String descripcion) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
	}
	
	public DTOArticulos() {
		super();
	}
	
}

