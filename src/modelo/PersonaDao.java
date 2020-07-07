package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexionBD.conexion;	

public class PersonaDao{
	
	PreparedStatement pst;
	ResultSet rs;
	conexion c = new conexion();
	Connection con;
	
	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<>();
		String consulta = "SELECT * FROM PERSONA";
		
		try {
			con = c.conectar();
			pst = con.prepareStatement(consulta);
			rs = pst.executeQuery();
			while (rs.next()) {
				Persona per = new Persona();
				Usuario us = new Usuario(); 
				per.setId_persona(rs.getString(1));
				per.setNombre(rs.getString(2));
				per.setApellido(rs.getString(3));
				per.setEmail(rs.getString(4));
				per.setTelefono(rs.getString(5));
				per.setDireccion(rs.getString(6));
				per.setPrevision(rs.getString(7));
				lista.add(per);
			}
		} catch (Exception e) {
		}
		return lista;
	}
	
	public int modificar(Persona per) {
		int r=0;
		String consulta = "";
		try {
			con = c.conectar();
			pst = con.prepareStatement(consulta);
			pst.setString(1, per.getId_persona());
			pst.setString(2, per.getNombre());
			pst.setString(3, per.getApellido());
			pst.setString(4, per.getEmail());
			pst.setString(5, per.getTelefono());
			pst.setString(6, per.getDireccion());
			rs = pst.executeQuery();
			if(r==1) {
				r=1;
			} else {
				r=0;
			}
			
		} catch (Exception e) {
		}
		return r;
	}
	
	public void eliminar (String id) {
		String consulta = "DELETE";
		try {
			con = c.conectar();
			pst = con.prepareStatement(consulta);
			pst.executeUpdate();
		} catch (Exception e) {

		}
	}
	
	public Persona listarPersona(String id) {
		String consulta = "select * from persona where id="+id; // cambiar a metodo mas seguro
		Persona per = new Persona();
		try {
			con = c.conectar();
			pst = con.prepareStatement(consulta);
			rs = pst.executeQuery();
			while (rs.next()) {
				per.setId_persona(rs.getString(1));
				per.setNombre(rs.getString(2));
				per.setApellido(rs.getString(3));
				per.setEmail(rs.getString(4));
				per.setTelefono(rs.getString(5));
				per.setDireccion(rs.getString(6));
			}
		} catch (Exception e) {
		}
		return per;
	}
}