package modelo;

public class Usuario {
	
	String id_usuario;
	String roles_id_rol;
	String persona_id_persona;
	String nombre_usuario;
	String password_usuario;
	
	
	public Usuario() {
		super();
	}


	public Usuario(String id_usuario, String roles_id_rol, String persona_id_persona, String nombre_usuario,
			String password_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.roles_id_rol = roles_id_rol;
		this.persona_id_persona = persona_id_persona;
		this.nombre_usuario = nombre_usuario;
		this.password_usuario = password_usuario;
	}



	public String getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}


	public String getRoles_id_rol() {
		return roles_id_rol;
	}


	public void setRoles_id_rol(String roles_id_rol) {
		this.roles_id_rol = roles_id_rol;
	}


	public String getPersona_id_persona() {
		return persona_id_persona;
	}


	public void setPersona_id_persona(String persona_id_persona) {
		this.persona_id_persona = persona_id_persona;
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

	
	
	

}
