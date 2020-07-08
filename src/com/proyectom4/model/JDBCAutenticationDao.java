package com.proyectom4.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.PreparedStatement;

public class JDBCAutenticationDao implements AutenticationDao {
	private Connection AutenticationConn;


	private final String SQL_COMPROBAR_ADMIN = "select * from usuario where nombre_usuario = ? and password_usuario = ? and roles_id_rol = 1";
	private final String SQL_COMPROBAR_PERSONA = "select * from usuario where nombre_usuario = ? and password_usuario = ? and roles_id_rol = 2";

	
	//PreparedStatement pst = null;
	//ResultSet rs = null;
	//conexion c = new conexion();
	//Connection con;
	
	public boolean autenticacionAdmin(String usuario, String password) {
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = (this.AutenticationConn != null) ? this.AutenticationConn : Conexion.getConnection();
			String consulta = SQL_COMPROBAR_ADMIN;
			stmt = conn.prepareStatement(consulta);
			stmt.setString(1, usuario);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.err.print("error en la conexion"+e);
		} finally {
			Conexion.close(rs);
			Conexion.close(stmt);
			if (this.AutenticationConn == null) {
				Conexion.close(conn);
			}
		/*
		try {
			if (conn.conectar() != null) conn.conectar().close();
			if (pst != null) pst.close();
			if (rs !=null) rs.close();
		} catch (Exception e2) {
		}*/
		}
		
		return false;
	}
	
	
	public boolean autenticacionPersona(String usuario, String password) {
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = (this.AutenticationConn != null) ? this.AutenticationConn : Conexion.getConnection();
			String consulta = SQL_COMPROBAR_PERSONA;
			stmt = conn.prepareStatement(consulta);
			stmt.setString(1, usuario);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.err.print("error en la conexion"+e);
		} finally {
			Conexion.close(rs);
			Conexion.close(stmt);
			if (this.AutenticationConn == null) {
				Conexion.close(conn);
			}
		/*
		try {
			if (conn.conectar() != null) conn.conectar().close();
			if (pst != null) pst.close();
			if (rs !=null) rs.close();
		} catch (Exception e2) {
		}*/
		}
		
		return false;
	}


}
