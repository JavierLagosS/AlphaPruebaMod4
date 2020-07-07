package com.proyectom4.dto;

import java.util.List;

import com.proyectom4.dto.PersonaDto;

public class UsuarioDto {
	private int id_usuario;
	private String nombre_usuario;
	private String password_usuario;
	private int roles_id_rol;
	private int persona_id_persona;
	private int usuario_activacion;
	private List<PersonaDto> persona;
	
	public UsuarioDto() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioDto(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getPassword_usuario() {
		return password_usuario;
	}

	public void setPassword_usuario(String password_usuario) {
		this.password_usuario = password_usuario;
	}

	public int getRoles_id_rol() {
		return roles_id_rol;
	}

	public void setRoles_id_rol(int roles_id_rol) {
		this.roles_id_rol = roles_id_rol;
	}

	public int getPersona_id_persona() {
		return persona_id_persona;
	}

	public void setPersona_id_persona(int persona_id_persona) {
		this.persona_id_persona = persona_id_persona;
	}

	public int getUsuario_activacion() {
		return usuario_activacion;
	}

	public void setUsuario_activacion(int usuario_activacion) {
		this.usuario_activacion = usuario_activacion;
	}

	@Override
	public String toString() {
		return "UsuarioDto [id_usuario=" + id_usuario + ", nombre_usuario=" + nombre_usuario + ", password_usuario="
				+ password_usuario + ", roles_id_rol=" + roles_id_rol + ", persona_id_persona=" + persona_id_persona
				+ ", usuario_activacion=" + usuario_activacion + "]";
	}

	

	
	
}
