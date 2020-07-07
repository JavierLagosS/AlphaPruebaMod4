package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conexionBD.conexion;
import modelo.Usuario;
import modelo.UsuarioDao;



public class consultaControlador {
	
	PreparedStatement pst = null;
	ResultSet rs = null;
	conexion c = new conexion();
	Connection con;
	
	
	
	public boolean autenticacionPersona(String usuario, String password) {
		try {
			con = c.conectar();
			String consulta = "solicitud";
			pst = con.prepareStatement(consulta);
			pst.setString(1, usuario);
			pst.setString(2, password);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.err.print("error en la conexion"+e);
		} finally {
		try {
			if (c.conectar() != null) c.conectar().close();
			if (pst != null) pst.close();
			if (rs !=null) rs.close();
		} catch (Exception e2) {
		}
		}
		
		return false;
	}
	
	public boolean autentificacionAdmin(String usuario, String password) {
		try {
			con = c.conectar();
			String query = "select nombre_usuario, password_usuario from usuario where usuario_password= ?";
			pst = con.prepareStatement(query);
			pst.setString(1, usuario);
			pst.setString(2, password);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
		    System.err.print("error en la conexion"+e);
	    } finally {
	    try {
		  if (c.conectar() != null) c.conectar().close();
		  if (pst != null) pst.close();
		  if (rs !=null) rs.close();
	    } catch (Exception e2) {
	  } 
	}	return false;
  }
	
	
	
	public Usuario exist(Usuario user) {
		Usuario usuario = null;
		c = null;
		 String query = "SELECT nombre_usuario FROM usuario WHERE nombre_usuario ='"
		 		+ user.getNombre_usuario() +"' AND password_usuario = '"+user.getPassword_usuario()+"'";
		 //System.out.println("Query: " + query);
	        try {
	        	con = c.conectar();
	            pst=con.prepareStatement(query);
	            rs=pst.executeQuery(query);
	            //recorriendo el objeto
	            while(rs.next()){
	            	usuario = new Usuario();
	            	usuario.setNombre_usuario(rs.getString("nombre_usuario")); 
	            	usuario.setPassword_usuario(rs.getString("password_usuario"));
	     
	            }
	        } catch (Exception e) {
	        }
		return usuario;
	}
	
	public Usuario isAdmin(Usuario user) {
		Usuario usuario = null;
		c = null;
		 String query = "SELECT nombre_usuario FROM usuario WHERE nombre_usuario ='"
		 		+ user.getNombre_usuario() +"' AND password_usuario = '"+user.getPassword_usuario()+"' and roles_id_rol = 1 ";
		 //System.out.println("Query: " + query);
	        try {
	        	con = c.conectar();
	            pst=con.prepareStatement(query);
	            rs=pst.executeQuery(query);
	            //recorriendo el objeto
	            while(rs.next()){
	            	usuario = new Usuario();
	            	usuario.setNombre_usuario(rs.getString("nombre_usuario")); 
	            	usuario.setPassword_usuario(rs.getString("password_usuario"));
	     
	            }
	        } catch (Exception e) {
	        }
		return usuario;
	}
}






