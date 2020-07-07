package com.proyectom4.model;

import java.sql.*;
import java.util.List;

import com.proyectom4.dto.RolesDto;

/**
 * Esta interfaz contiene los metodos abstractos con las 
 * operaciones basicas sobre la tabla
 * CRUD (Create, Read, Update y Delete)
 * Se debe crear una clase concreta para implementar el
 * codigo asociado a cada metodo
 *
 */

public interface RolesDao {
	
	public int insert(RolesDto rol) 
		throws SQLException;
	
	public int update(RolesDto rol)
		throws SQLException;
	
	public int delete(RolesDto rol)
		throws SQLException;
	
	public List<RolesDto> select() throws SQLException;

}
