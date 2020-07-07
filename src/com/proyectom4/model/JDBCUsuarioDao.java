package com.proyectom4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.proyectom4.dto.UsuarioDto;

public class JDBCUsuarioDao implements UsuarioDao {
	private Connection usariosConn;

	private final String SQL_INSERT = "INSERT INTO usuario(nombre_usuario, password_usuario, roles_id_rol, persona_id_persona) VALUES(?, ?, ? ,?)";

	private final String SQL_UPDATE = "UPDATE usuario SET nombre_usuario = ?, password_usuario = ?, roles_id_rol = ?, persona_id_persona = ? WHERE id_usuario=?";


	private final String SQL_DESACTIVAR = "UPDATE usuario SET usuario_activacion = 0 WHERE id_usuario=?";

	private final String SQL_SELECT = "Select id_usuario, nombre_usuario, password_usuario, roles_id_rol, persona_id_persona, id_persona, nombre, apellido, email, telefono, direccion, sistema_prevision from usuario where usuario_activacion = 1";

	@Override
	public List<UsuarioDto> select() throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		UsuarioDto UsuarioDto = null;

		List<UsuarioDto> usarios = new ArrayList<UsuarioDto>();

		try {

			conn = (this.usariosConn != null) ? this.usariosConn : Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();

			while (rs.next()) {
				// Por cada registro se recuperan los valores
				// de las columnas y se crea un objeto DTO
				// nombre, apellido, email, telefono, direccion, sistema_prevision
				int id_usuario= rs.getInt(1);
				String nombre_usuario = rs.getString(2);
				String password_usuario = rs.getString(3);
				int roles_rol_id = rs.getInt(4);
				int persona_id_persona = rs.getInt(5);

				// Llenamos el DTO y lo agregamos a la lista
				UsuarioDto = new UsuarioDto();
				UsuarioDto.setId_usuario(id_usuario);
				UsuarioDto.setNombre_usuario(nombre_usuario);
				UsuarioDto.setPassword_usuario(password_usuario);
				UsuarioDto.setRoles_id_rol(roles_rol_id);
				UsuarioDto.setPersona_id_persona(persona_id_persona);
				usarios.add(UsuarioDto);
			}
		} finally {
			Conexion.close(rs);
			Conexion.close(stmt);
			if (this.usariosConn == null) {
				Conexion.close(conn);
			}
		}
		return usarios;
	}

	@Override
	public int insert(UsuarioDto usuario) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			conn = (this.usariosConn != null) ? this.usariosConn : Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);

			int index = 1;

			stmt.setString(index++, usuario.getNombre_usuario());
			stmt.setString(index++, usuario.getPassword_usuario());
			stmt.setInt(index++, usuario.getRoles_id_rol());
			stmt.setInt(index++, usuario.getPersona_id_persona());

			// System.out.println("Ejecutando query:" + SQL_INSERT);
			rows = stmt.executeUpdate();
			// System.out.println("Registros afectados:" + rows);
		} finally {
			Conexion.close(stmt);
			if (this.usariosConn == null) {
				Conexion.close(conn);
			}
		}
		return rows;
	}

	@Override
	public int update(UsuarioDto usuario) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(UsuarioDto usuario) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		UsuarioDto UsuarioDto = null;
		int rows = 0;
		try {
			conn = (this.usariosConn != null) ? this.usariosConn : Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_DESACTIVAR);
			stmt.setInt(1, usuario.getId_usuario());

			rows = stmt.executeUpdate();
		} finally {
			Conexion.close(stmt);
			if (this.usariosConn == null) {
				Conexion.close(conn);
			}
		}
		return rows;
	}
}
