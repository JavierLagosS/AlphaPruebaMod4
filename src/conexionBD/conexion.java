package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import conexionBD.conexion;

public class conexion {
	
	private final String stringConexion = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public Connection conectar() {
		Connection conexion = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(stringConexion,"root","root");
		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra el driver"+e.getMessage());
		}
		catch(SQLException e){
			System.out.println("Error en la conexión");
		}
		return conexion;
	}

	
}
