package com.proyectom4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.proyectom4.dto.UsuarioDto;

public class JDBCRegistroAccidenteDao implements RegistroAccidenteDao {
	private Connection usariosConn;

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

	private final String SQL_SELECT = "Select "
			+ "id_registro_accidente, "
			+ "fecha_accidente, "
			+ "cargo_accidentado, "
			+ "descripcion, "
			+ "usuario_id_usuario, "
			+ "tipo_id_tipo, "
			+ "persona_id_persona"
			+ "id_usuario, "
			+ "nombre_usuario, "
			+ "password_usuario, "
			+ "roles_id_rol, "
			+ "persona_id_persona, "
			+ "id_persona, "
			+ "nombre, "
			+ "apellido, "
			+ "email, "
			+ "telefono, "
			+ "direccion, "
			+ "sistema_prevision "
			+ "from usuario u inner join persona p on p.id_persona = u.persona_id_persona where usuario_activacion = 1";
	
	private final String SQL_SELECT_CALL = "SELECT *  FROM    REGISTRO_ACCIDENTE R\r\n" + 
			"INNER JOIN \r\n" + 
			"    (SELECT P.ID_PERSONA, P.NOMBRE, P.APELLIDO, P.SISTEMA_PREVISION FROM REGISTRO_ACCIDENTE R \r\n" + 
			"        INNER JOIN PERSONA P ON P.ID_PERSONA = R.PERSONA_ID_PERSONA) PR ON PR.ID_PERSONA = R.PERSONA_ID_PERSONA\r\n" + 
			"INNER JOIN USUARIO U ON U.ID_USUARIO = R.USUARIO_ID_USUARIO\r\n" + 
			"INNER JOIN PERSONA P ON P.ID_PERSONA = U.PERSONA_ID_PERSONA\r\n" + 
			"INNER JOIN TIPO T ON T.ID_TIPO = R.TIPO_ID_TIPO\r\n" + 
			"WHERE R.REGISTRO_ACCIDENTE_ACTIVACION = 1;";

}