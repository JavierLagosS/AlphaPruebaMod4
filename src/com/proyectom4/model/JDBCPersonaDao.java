package com.proyectom4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.proyectom4.dto.PersonaDto;

public class JDBCPersonaDao implements PersonaDao {

	private Connection personasConn;

	private final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono, direccion, sistema_prevision) VALUES(?, ?, ? ,? , ?, ?)";

	private final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ?, direccion = ?, sistema_prevision = ?  WHERE id_persona=?";

	// private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

	private final String SQL_DESACTIVAR = "UPDATE persona SET persona_activacion = 0 WHERE id_persona=?";

	private final String SQL_SELECT = "Select id_persona, nombre, apellido, email, telefono, direccion, sistema_prevision from persona where persona_activacion = 1";

	private final String SQL_SELECT_BY_ID = "Select * from persona where id_persona = ? and persona_activacion = 1";

	@Override
	public List<PersonaDto> select() throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		PersonaDto PersonaDto = null;

		List<PersonaDto> personas = new ArrayList<PersonaDto>();

		try {

			conn = (this.personasConn != null) ? this.personasConn : Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();

			while (rs.next()) {
				// Por cada registro se recuperan los valores
				// de las columnas y se crea un objeto DTO
				// nombre, apellido, email, telefono, direccion, sistema_prevision
				int id_persona = rs.getInt(1);
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
				String email = rs.getString(4);
				String telefono = rs.getString(5);
				String direccion = rs.getString(6);
				String sistema_prevision = rs.getString(7);
				
				// Llenamos el DTO y lo agregamos a la lista
				PersonaDto = new PersonaDto();
				PersonaDto.setId_persona(id_persona);
				PersonaDto.setNombre(nombre);
				PersonaDto.setApellido(apellido);
				PersonaDto.setEmail(email);
				PersonaDto.setTelefono(telefono);
				PersonaDto.setDireccion(direccion);
				PersonaDto.setSistema_prevision(sistema_prevision);
				personas.add(PersonaDto);
			}
		} finally {
			Conexion.close(rs);
			Conexion.close(stmt);
			if (this.personasConn == null) {
				Conexion.close(conn);
			}
		}
		return personas;
	}
	

	


	@Override
	public int insert(PersonaDto persona) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			conn = (this.personasConn != null) ? this.personasConn : Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);

			int index = 1;

			stmt.setString(index++, persona.getNombre());
			stmt.setString(index++, persona.getApellido());
			stmt.setString(index++, persona.getEmail());
			stmt.setString(index++, persona.getTelefono());
			stmt.setString(index++, persona.getDireccion());
			stmt.setString(index++, persona.getSistema_prevision());

			// System.out.println("Ejecutando query:" + SQL_INSERT);
			rows = stmt.executeUpdate();
			// System.out.println("Registros afectados:" + rows);
		} finally {
			Conexion.close(stmt);
			if (this.personasConn == null) {
				Conexion.close(conn);
			}
		}
		return rows;
	}

	@Override
	public int update(PersonaDto persona) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(PersonaDto persona) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		PersonaDto PersonaDto = null;
		int rows = 0;
		try {
			conn = (this.personasConn != null) ? this.personasConn : Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_DESACTIVAR);
			stmt.setInt(1, persona.getId_persona());

			rows = stmt.executeUpdate();
		} finally {
			Conexion.close(stmt);
			if (this.personasConn == null) {
				Conexion.close(conn);
			}
		}
		return rows;
	}
}
