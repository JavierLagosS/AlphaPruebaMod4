package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import conexionBD.conexion;

public class conexion {
	
	//private final String stringConexion = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String stringConexion = "jdbc:mysql://localhost/dbproyectom4?useSSL=false";
	
	public Connection conectar() {
		Connection conexion = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(stringConexion,"root","");
		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra el driver"+e.getMessage());
		}
		catch(SQLException e){
			e.printStackTrace();
			System.out.println("Error en la conexión");
		}
		return conexion;
	}

	
}
