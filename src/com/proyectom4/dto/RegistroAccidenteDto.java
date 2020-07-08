package com.proyectom4.dto;

import java.sql.Date; //  System.out.println("sql.Timestamp: "+sqlTimestamp);
//http://carloszuluaga.wikidot.com/articulos:manejo-de-fechas-en-java-i

public class RegistroAccidenteDto {
	private int id_registro_accidente;
	private int usuario_id_usuario;
	private int persona_id_persona;
	private int tipo_id_tipo;
	private Date fecha_accidentado;
	private String cargo_accidentado;
	private String descripcion;
	private int registro_accidente_activacion;
	
	public RegistroAccidenteDto() {
		// TODO Auto-generated constructor stub
	}
	
	public RegistroAccidenteDto(int id_registro_accidente) {
		this.id_registro_accidente = id_registro_accidente;
	}

	public int getId_registro_accidente() {
		return id_registro_accidente;
	}

	public void setId_registro_accidente(int id_registro_accidente) {
		this.id_registro_accidente = id_registro_accidente;
	}

	public int getUsuario_id_usuario() {
		return usuario_id_usuario;
	}

	public void setUsuario_id_usuario(int usuario_id_usuario) {
		this.usuario_id_usuario = usuario_id_usuario;
	}

	public int getPersona_id_persona() {
		return persona_id_persona;
	}

	public void setPersona_id_persona(int persona_id_persona) {
		this.persona_id_persona = persona_id_persona;
	}

	public int getTipo_id_tipo() {
		return tipo_id_tipo;
	}

	public void setTipo_id_tipo(int tipo_id_tipo) {
		this.tipo_id_tipo = tipo_id_tipo;
	}

	public Date getFecha_accidentado() {
		return fecha_accidentado;
	}

	public void setFecha_accidentado(Date fecha_accidentado) {
		this.fecha_accidentado = fecha_accidentado;
	}

	public String getCargo_accidentado() {
		return cargo_accidentado;
	}

	public void setCargo_accidentado(String cargo_accidentado) {
		this.cargo_accidentado = cargo_accidentado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getRegistro_accidente_activacion() {
		return registro_accidente_activacion;
	}

	public void setRegistro_accidente_activacion(int registro_accidente_activacion) {
		this.registro_accidente_activacion = registro_accidente_activacion;
	}

	@Override
	public String toString() {
		return "RegistroAccidenteDto [id_registro_accidente=" + id_registro_accidente + ", usuario_id_usuario="
				+ usuario_id_usuario + ", persona_id_persona=" + persona_id_persona + ", tipo_id_tipo=" + tipo_id_tipo
				+ ", fecha_accidentado=" + fecha_accidentado + ", cargo_accidentado=" + cargo_accidentado
				+ ", descripcion=" + descripcion + ", registro_accidente_activacion=" + registro_accidente_activacion
				+ "]";
	}
	
	
	
	
}
