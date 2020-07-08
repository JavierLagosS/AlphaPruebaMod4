package TestMain;

import java.io.PrintWriter;
import java.sql.SQLException;

import com.proyectom4.dto.PersonaDto;
import com.proyectom4.model.JDBCPersonaDao;
import com.proyectom4.model.PersonaDao;

public class Main {
	public static void main(String[] args) {

		/*
		 * Probar insert Persona PersonaDto p = new PersonaDto(); PersonaDao dao = new
		 * JDBCPersonaDao();
		 * 
		 * 
		 * p.setNombre("a1"); p.setApellido("b2"); p.setEmail("c3");
		 * p.setTelefono("c5"); p.setDireccion("c6"); p.setSistema_prevision("54");
		 * 
		 * try { dao.insert(p); } catch (SQLException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */
		
		PersonaDao dao  = new JDBCPersonaDao();
		PersonaDto p = new PersonaDto();
		// String json = null;
//		try {
//			json = new Gson().toJson(dao.getById(1));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	   try {
		    p.setId_persona(1);
		    	
		    System.out.println(p);
	} catch (Exception e) {
		e.printStackTrace();
	}

	}
}