package com.proyectom4.model;

import java.sql.*;
import java.util.List;
import com.proyectom4.dto.UsuarioDto;

/**
 * Esta interfaz contiene los metodos abstractos con las 
 * operaciones basicas sobre la tabla
 * CRUD (Create, Read, Update y Delete)
 * Se debe crear una clase concreta para implementar el
 * codigo asociado a cada metodo
 *
 */

public interface UsuarioDao {
	
	public int insert(UsuarioDto usuario) 
		throws SQLException;
	
	public int update(UsuarioDto usuario)
		throws SQLException;
	
	public int delete(UsuarioDto usuario)
		throws SQLException;
	
	public List<UsuarioDto> select() throws SQLException;
	
	public boolean autenticacionPersona(String usuario, String password);
	public boolean autenticacionAdmin(String usuario, String password);

}
