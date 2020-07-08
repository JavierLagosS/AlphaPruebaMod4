package com.proyectom4.model;

import java.sql.*;
import java.util.List;
import com.proyectom4.dto.RegistroAccidenteDto;

/**
 * Esta interfaz contiene los metodos abstractos con las 
 * operaciones basicas sobre la tabla
 * CRUD (Create, Read, Update y Delete)
 * Se debe crear una clase concreta para implementar el
 * codigo asociado a cada metodo
 *
 */

public interface RegistroAccidenteDao {
	
	public int insert(RegistroAccidenteDto usuario) 
		throws SQLException;
	
	public int update(RegistroAccidenteDto usuario)
		throws SQLException;
	
	public int delete(RegistroAccidenteDto usuario)
		throws SQLException;
	
	public List<RegistroAccidenteDto> select() throws SQLException;

}
