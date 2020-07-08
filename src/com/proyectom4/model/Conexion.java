package com.proyectom4.model;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Conexion {
	//Registramos las constantes de conexion
	private static String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static String JDBC_USER = "root";
	private static String JDBC_PASS = "root";
	//generamos un atributo driver del tipo Driver null
	static Driver  driver = null;
	
	//Preparamos la conexion
	public static synchronized Connection getConnection() throws SQLException {
		if (driver == null) {
			try {
				// se registra driver
				Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
				driver = (Driver) jdbcDriverClass.newInstance();
				// se carga registro en driver
				DriverManager.registerDriver(driver);
				System.out.println("ok");
			} catch (Exception e) {
				// Si hay error lanza la excepcion
				System.out.println("Fallo en cargar el driver JDBC");
				//muestra la pila o log de exepciones
				e.printStackTrace();
			}
		}
		// se retorna la conexión con los parametros
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
	}
	
	// cierre de ResulSet, PreparedStatement, Connection por motivos de seguridad

		public static void close(ResultSet rs) {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException sqle) {
				// TODO: handle exception
				sqle.printStackTrace();
			}
		}

		public static void close(PreparedStatement stmt) {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException sqle) {
				// TODO: handle exception
				sqle.printStackTrace();
			}
		}

		public static void close(Connection conn) {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				// TODO: handle exception
				sqle.printStackTrace();
			}
		}
}
