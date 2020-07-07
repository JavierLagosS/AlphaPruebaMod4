package modelo;


public class Persona {
	String id_persona;
	String nombre;
	String apellido;
	String email;
	String telefono;
	String direccion;
	String prevision;
	
	
	public Persona() {
		super();
	}
	
	


	public Persona(String id_persona, String nombre, String apellido, String email, String telefono, String direccion,
			String prevision) {
		super();
		this.id_persona = id_persona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.prevision = prevision;
	}




	public String getId_persona() {
		return id_persona;
	}

	public void setId_persona(String id_persona) {
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




	public String getPrevision() {
		return prevision;
	}




	public void setPrevision(String prevision) {
		this.prevision = prevision;
	}

	
	
}