package com.proyectom4.dto;

public class PersonaDto {
	
	private int id_persona;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String direccion;
	private String sistema_prevision;
	private int persona_activacion;
	
	public PersonaDto() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonaDto(int id_persona) {
		this.id_persona = id_persona;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void email(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSistema_prevision() {
		return sistema_prevision;
	}

	public void setSistema_prevision(String sistema_prevision) {
		this.sistema_prevision = sistema_prevision;
	}

	public int getPersona_activacion() {
		return persona_activacion;
	}

	public void setPersona_activacion(int persona_activacion) {
		this.persona_activacion = persona_activacion;
	}

	@Override
	public String toString() {
		return "PersonaDto [id_persona=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
				+ email + ", telefono=" + telefono + ", direccion=" + direccion + ", sistema_prevision="
				+ sistema_prevision + ", persona_activacion=" + persona_activacion + "]";
	}
	
	
}
