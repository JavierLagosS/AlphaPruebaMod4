package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import conexionBD.conexion;

public class AccidenteDao {
	
	PreparedStatement ps;
	PreparedStatement pst;
	ResultSet rs;
	ResultSet rst;
	conexion c = new conexion();
	Connection con;
	
	public List <AccPersona> listar() {
		List<AccPersona> listaAc = new ArrayList<>();
		String consulta = "select * from registro_accidente";
		//String conulta2 = "select";
		try { 
			con = c.conectar();
			ps = con.prepareStatement(consulta);
			//pst = con.prepareStatement(conulta2);
			rs = ps.executeQuery();
			//rst = pst.executeQuery();
			while (rs.next()) {
				
				AccPersona aP = new AccPersona();
				aP.setId_registro_accidente(rs.getString(1));
				aP.setSistema_previsional_id_sistema(rs.getString(2));
				aP.setTipo_id_tipo(rs.getString(3));
				aP.setFecha_accidente(rs.getString(4));
				aP.setCargo_accidentado(rs.getString(5));
				aP.setDescripcion(rs.getString(6));
				aP.setUsuario_id_usuario(rs.getString(7));
				aP.setId_persona(rs.getString(8));
			
				;  						
				listaAc.add(aP);	
			}
		} catch (Exception e) {	
		}
		return listaAc;
	}
	
	public int agregarAcc(AccPersona p) {
		int r=0;
		String consulta = "";
		try {
			con = c.conectar();
			pst = con.prepareStatement(consulta);
			pst.setString(1, p.getId_registro_accidente());
			pst.setString(2, p.getSistema_previsional_id_sistema());
			pst.setString(3, p.getTipo_id_tipo());
			pst.setString(4, p.getFecha_accidente());
			pst.setString(5, p.getCargo_accidentado());
			pst.setString(6, p.getDescripcion());
			// nombre registro asignar en controlador
			if(r==1) {
				r=1;
			} else {
				r=0;
			}
		} catch (Exception e) {
		}
		return r;
	}
	
	public int actualizarAcc (AccPersona p) {
		int r=0;
		String consulta = "update";
		try {
			con = c.conectar();
			pst = con.prepareStatement(consulta);
			pst.setString(1, p.getId_registro_accidente());
			pst.setString(2, p.getSistema_previsional_id_sistema());
			pst.setString(3, p.getTipo_id_tipo());
			pst.setString(4, p.getFecha_accidente());
			pst.setString(5, p.getCargo_accidentado());
			pst.setString(6, p.getDescripcion());
			// nombre registro asignar en controlador
		} catch (Exception e) {
			
		}
		return r;
	}
	
	public void eliminarAcc (String id) {
		String consulta = "DELETE";
		try {
			con = c.conectar();
			pst = con.prepareStatement(consulta);
			pst.executeUpdate();
		} catch (Exception e) {

		}
	}

}
