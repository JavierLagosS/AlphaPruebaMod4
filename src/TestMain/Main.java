package TestMain;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.proyectom4.dto.PersonaDto;
import com.proyectom4.dto.RegistroAccidenteDto;
import com.proyectom4.dto.UsuarioDto;
import com.proyectom4.model.AutenticationDao;
import com.proyectom4.model.JDBCAutenticationDao;
import com.proyectom4.model.JDBCPersonaDao;
import com.proyectom4.model.JDBCRegistroAccidenteDao;
import com.proyectom4.model.JDBCUsuarioDao;
import com.proyectom4.model.PersonaDao;
import com.proyectom4.model.RegistroAccidenteDao;
import com.proyectom4.model.UsuarioDao;

public class Main {
	public static void main(String[] args) throws Exception {

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
		RegistroAccidenteDao dao = new JDBCRegistroAccidenteDao();
			
		List<RegistroAccidenteDto> u = dao.select();
		System.out.println(dao.select());
			
			
			
		

	}
}