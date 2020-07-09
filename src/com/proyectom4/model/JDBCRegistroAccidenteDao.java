package com.proyectom4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.proyectom4.dto.PersonaDto;
import com.proyectom4.dto.RegistroAccidenteDto;
import com.proyectom4.dto.UsuarioDto;

public class JDBCRegistroAccidenteDao implements RegistroAccidenteDao {
	private Connection registrosConn;

	private final String SQL_INSERT = "INSERT INTO registro_accidente"
			+ "("
			+ "fecha_accidente, "
			+ "cargo_accidentado, "
			+ "descripcion, "
			+ "usuario_id_usuario, "
			+ "tipo_id_tipo, "
			+ "persona_id_persona) "
			+ "VALUES("
			+ "?, "
			+ "?, "
			+ "? ,"
			+ "?, "
			+ "? , "
			+ "?)";

	private final String SQL_UPDATE = ""
			+ "UPDATE registro_accidente SET "
			+ "fecha_accidente = ?, "
			+ "cargo_accidentado = ?, "
			+ "descripcion = ?, "
			+ "usuario_id_usuario = ?, "
			+ "tipo_id_tipo = ?, "
			+ "persona_id_persona = ? "
			+ "WHERE id_usuario=?";


	private final String SQL_DESACTIVAR = "UPDATE registro_accidente SET registro_accidente_activacion = 0 WHERE id_registro_accidente = ?";

	private final String SQL_SELECT ="SELECT "
			+ "U.ID_USUARIO, "  //1
			+ "P.ID_PERSONA, " //2
			+ "R.ID_REGISTRO_ACCIDENTE AS REGISTRO, " //3
			+ "P.NOMBRE AS NOMBRE,"  //4
			+ " R.CARGO_ACCIDENTADO,"  //5
			+ "PR.TELEFONO AS TELEFONO,"  //6
			+ "PR.DIRECCION AS DIRECCION,"  //7
			+ "R.FECHA_ACCIDENTE AS FECHA, "  //8
			+ "T.NOMBRE_TIPO AS TIPO_ACCIDENTE,\r\n" +   //9
			"R.DESCRIPCION AS DESCRIPCION, "  //10
			+ "PR.ID_PERSONA, "  //11
			+ "PR.NOMBRE AS ACCIDENTADO, "  //12
			+ "PR.APELLIDO, "  //13
			+ "PR.SISTEMA_PREVISION" //14
			+ "FROM    REGISTRO_ACCIDENTE R\r\n" + 
			"INNER JOIN \r\n" + 
			"    (SELECT P.ID_PERSONA, P.NOMBRE, P.APELLIDO, P.SISTEMA_PREVISION, PR.TELEFONO, PR.DIRECCION  FROM REGISTRO_ACCIDENTE R \r\n" + 
			"        INNER JOIN PERSONA P ON P.ID_PERSONA = R.PERSONA_ID_PERSONA) PR ON PR.ID_PERSONA = R.PERSONA_ID_PERSONA\r\n" + 
			"INNER JOIN USUARIO U ON U.ID_USUARIO = R.USUARIO_ID_USUARIO\r\n" + 
			"INNER JOIN PERSONA P ON P.ID_PERSONA = U.PERSONA_ID_PERSONA\r\n" + 
			"INNER JOIN TIPO T ON T.ID_TIPO = R.TIPO_ID_TIPO\r\n" + 
			"WHERE R.REGISTRO_ACCIDENTE_ACTIVACION = 1;";

	
	
	private final String SQL_SELECT_SIMPLE ="SELECT "
			+ "id_registro_accidente," //1
			+ "fecha_accidente," //2
			+ "cargo_accidentado," //3
			+ "descripcion," //4
			+ "usuario_id_usuario," //5
			+ "tipo_id_tipo," //6
			+ "persona_id_persona " //7
			+ "from registro_accidente " + 
			"where registro_accidente_activacion = 1";
	
	@Override
	public List<RegistroAccidenteDto> select() throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		RegistroAccidenteDto RegistroAccidenteDto = null;

		List<RegistroAccidenteDto> registros = new ArrayList<RegistroAccidenteDto>();
		try {

			conn = (this.registrosConn != null) ? this.registrosConn : Conexion.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT_SIMPLE);
			rs = stmt.executeQuery();
			
			
			while (rs.next()) {
				// Por cada registro se recuperan los valores
				// de las columnas y se crea un objeto DTO
				// nombre, apellido, email, telefono, direccion, sistema_prevision
				
				int id_registro_accidente = rs.getInt(1);
				String fecha_accidente = rs.getString(2);
				String cargo_accidentado = rs.getString(3);	
				String descripcion = rs.getString(4);
				int id_usuario = rs.getInt(5);
				int id_tipo = rs.getInt(6);
				int id_persona = rs.getInt(7);
					
				
				// Llenamos el DTO y lo agregamos a la lista
				//UsuarioDto usuario = new UsuarioDto();
				RegistroAccidenteDto registro = new RegistroAccidenteDto();
				RegistroAccidenteDto.setId_registro_accidente(id_registro_accidente);
				RegistroAccidenteDto.setFecha_accidentado(fecha_accidente);
				RegistroAccidenteDto.setCargo_accidentado(cargo_accidentado);
				RegistroAccidenteDto.setDescripcion(descripcion);
				RegistroAccidenteDto.setUsuario_id_usuario(id_usuario);
				RegistroAccidenteDto.setTipo_id_tipo(id_tipo);
				RegistroAccidenteDto.setPersona_id_persona(id_persona);	
				
				registros.add(RegistroAccidenteDto);
				}
		} finally {
			Conexion.close(rs);
			Conexion.close(stmt);
			if (this.registrosConn == null) {
				Conexion.close(conn);
			}
		}
		return registros;
	}

	@Override
	public int insert(RegistroAccidenteDto usuario) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RegistroAccidenteDto usuario) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(RegistroAccidenteDto usuario) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}