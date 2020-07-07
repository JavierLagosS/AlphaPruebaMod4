package com.proyectom4.model;

import java.sql.SQLException;
import java.util.List;

import com.proyectom4.dto.PersonaDto;


/**
 * Esta interfaz contiene los metodos abstractos con las 
 * operaciones basicas sobre la tabla
 * CRUD (Create, Read, Update y Delete)
 * Se debe crear una clase concreta para implementar el
 * codigo asociado a cada metodo
 *
 */
public interface PersonaDao {
	
	public int insert(PersonaDto persona) 
			throws SQLException;
		
		public int update(PersonaDto persona)
			throws SQLException;
		
		public int delete(PersonaDto persona)
			throws SQLException;
		
		public List<PersonaDto> select() throws SQLException;
}
