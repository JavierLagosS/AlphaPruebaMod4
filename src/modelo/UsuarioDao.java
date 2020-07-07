package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexionBD.conexion;

public class UsuarioDao {
	PreparedStatement pst;
	ResultSet rs;
	conexion c = new conexion();
	Connection con;
	
	public List<Usuario> listar() {
		List<Usuario> listaU = new ArrayList<>();
		String consulta = "";
		
		try {
			con = c.conectar();
			pst = con.prepareStatement(consulta);
			rs = pst.executeQuery();
			while (rs.next()) {
				Usuario u = new Usuario();
				u.setId_usuario(rs.getString(1));
				u.setRoles_id_rol(rs.getString(2));
				u.setPersona_id_persona(rs.getString(3));
				u.setNombre_usuario(rs.getString(4));
				u.setPassword_usuario(rs.getString(5));
				listaU.add(u);
			}
		} catch (Exception e) {
		}
		return listaU;
	}
	
	public int modificarU (Usuario u) {
		int r=0;
		String consulta = "";
		try {
			con = c.conectar();
			pst = con.prepareStatement(consulta);
			pst.setString(1, u.getId_usuario());
			pst.setString(2, u.getRoles_id_rol());
			pst.setString(3, u.getPersona_id_persona());
			pst.setString(4, u.getNombre_usuario());
			pst.setString(5, u.getPassword_usuario());
			rs = pst.executeQuery();
			if (r==1) {
				r=1;
			} else {
				r = 0;
			}
		} catch (Exception e) {

		}
		
		return r;
	}
	
	public void eliminarU (String id) {
		String consulta = "update persona set persona_activacion  = 0  where id_persona= ? ";
		try {
			con = c.conectar();
			pst = con.prepareStatement(consulta);
			pst.executeUpdate();
		} catch (Exception e) {

		}
	}
	
}
