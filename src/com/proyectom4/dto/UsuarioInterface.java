package com.proyectom4.dto;

import java.sql.Date;

public interface UsuarioInterface {
	
	public int getId_usuario();


	public void setId_usuario(int id_usuario);

	public String getNombre_usuario();


	public void setNombre_usuario(String nombre_usuario);


	public String getPassword_usuario();


	public void setPassword_usuario(String password_usuario);

	public int getRoles_id_rol();

	public void setRoles_id_rol(int roles_id_rol);

	public int getPersona_id_persona();
	public void setPersona_id_persona(int persona_id_persona);

	public int getUsuario_activacion();

	public void setUsuario_activacion(int usuario_activacion);
	
	public String getNombre_rol();
	

	public void setNombre_rol(String nombre_rol);
	

	public String getSistema_prevision();

	public void setSistema_prevision(String sistema_prevision);
	

	public int getId_registro_accidente();

	public void setId_registro_accidente(int id_registro_accidente);

	public int getUsuario_id_usuario();

	public void setUsuario_id_usuario(int usuario_id_usuario);
	public int getTipo_id_tipo();

	public void setTipo_id_tipo(int tipo_id_tipo);

	public Date getFecha_accidentado();

	public void setFecha_accidentado(Date fecha_accidentado);

	public String getCargo_accidentado();

	public void setCargo_accidentado(String cargo_accidentado);

	public String getDescripcion();

	public void setDescripcion(String descripcion);

	public int getRegistro_accidente_activacion();

	public void setRegistro_accidente_activacion(int registro_accidente_activacion);

}
