package com.proyectom4.dto;

public class RolesDto {
	private int id_rol;
	private String nombre_rol;
	private int roles_activacion;
	
	public RolesDto() {
		// TODO Auto-generated constructor stub
	}
	
	public RolesDto(int id_rol) {
		this.id_rol = id_rol;
	}

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre_rol() {
		return nombre_rol;
	}

	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}

	public int getRoles_activacion() {
		return roles_activacion;
	}

	public void setRoles_activacion(int roles_activacion) {
		this.roles_activacion = roles_activacion;
	}

	@Override
	public String toString() {
		return "RolesDto [id_rol=" + id_rol + ", nombre_rol=" + nombre_rol + ", roles_activacion=" + roles_activacion
				+ "]";
	}
	
	
}
