package com.proyectom4.model;

public interface AutenticationDao {
	public boolean autenticacionPersona(String usuario, String password);
	public boolean autenticacionAdmin(String usuario, String password);
}
