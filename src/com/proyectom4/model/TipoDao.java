package com.proyectom4.model;

import java.sql.*;
import java.util.List;

import com.proyectom4.dto.TipoDto;

/**
 * Esta interfaz contiene los metodos abstractos con las 
 * operaciones basicas sobre la tabla
 * CRUD (Create, Read, Update y Delete)
 * Se debe crear una clase concreta para implementar el
 * codigo asociado a cada metodo
 *
 */

public interface TipoDao {
	
	public int insert(TipoDto rol) 
		throws SQLException;
	
	public int update(TipoDto rol)
		throws SQLException;
	
	public int delete(TipoDto rol)
		throws SQLException;
	
	public List<TipoDto> select() throws SQLException;

}
