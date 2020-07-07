package modelo;

public class AccPersona { 
	
	String id_registro_accidente;
	String sistema_previsional_id_sistema;
	String tipo_id_tipo;
	String fecha_accidente;
	String cargo_accidentado;
	String descripcion;
	String usuario_id_usuario;
	String id_persona;
	
	
	public AccPersona() {
		super();
	}
	
	

	public AccPersona(String id_registro_accidente, String sistema_previsional_id_sistema, String tipo_id_tipo,
			String fecha_accidente, String cargo_accidentado, String descripcion, String usuario_id_usuario,
			String id_persona) {
		super();
		this.id_registro_accidente = id_registro_accidente;
		this.sistema_previsional_id_sistema = sistema_previsional_id_sistema;
		this.tipo_id_tipo = tipo_id_tipo;
		this.fecha_accidente = fecha_accidente;
		this.cargo_accidentado = cargo_accidentado;
		this.descripcion = descripcion;
		this.usuario_id_usuario = usuario_id_usuario;
		this.id_persona = id_persona;
	}





	public String getId_registro_accidente() {
		return id_registro_accidente;
	}


	public void setId_registro_accidente(String id_registro_accidente) {
		this.id_registro_accidente = id_registro_accidente;
	}


	public String getSistema_previsional_id_sistema() {
		return sistema_previsional_id_sistema;
	}


	public void setSistema_previsional_id_sistema(String sistema_previsional_id_sistema) {
		this.sistema_previsional_id_sistema = sistema_previsional_id_sistema;
	}


	public String getTipo_id_tipo() {
		return tipo_id_tipo;
	}


	public void setTipo_id_tipo(String tipo_id_tipo) {
		this.tipo_id_tipo = tipo_id_tipo;
	}


	public String getFecha_accidente() {
		return fecha_accidente;
	}


	public void setFecha_accidente(String fecha_accidente) {
		this.fecha_accidente = fecha_accidente;
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


	public String getUsuario_id_usuario() {
		return usuario_id_usuario;
	}


	public void setUsuario_id_usuario(String usuario_id_usuario) {
		this.usuario_id_usuario = usuario_id_usuario;
	}


	public String getId_persona() {
		return id_persona;
	}


	public void setId_persona(String id_persona) {
		this.id_persona = id_persona;
	}
	
	
	
}