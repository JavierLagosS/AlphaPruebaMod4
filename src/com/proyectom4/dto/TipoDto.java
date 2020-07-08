package com.proyectom4.dto;

public class TipoDto {
	private int id_tipo;
	private String nombre_tipo;
	private int tipo_activacion;
	
	public TipoDto() {
		// TODO Auto-generated constructor stub
	}
	
	public TipoDto(int id_tipo) {
		this.id_tipo = id_tipo;
	}

	public int getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getNombre_tipo() {
		return nombre_tipo;
	}

	public void setNombre_tipo(String nombre_tipo) {
		this.nombre_tipo = nombre_tipo;
	}

	public int getTipo_activacion() {
		return tipo_activacion;
	}

	public void setTipo_activacion(int tipo_activacion) {
		this.tipo_activacion = tipo_activacion;
	}

	@Override
	public String toString() {
		return "TipoDto [id_tipo=" + id_tipo + ", nombre_tipo=" + nombre_tipo + ", tipo_activacion=" + tipo_activacion
				+ "]";
	}
	
	
}	
