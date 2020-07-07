package TestMain;

import modelo.Persona;
import modelo.PersonaDao;

public class Main {
	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		PersonaDao dao = new PersonaDao();
		p1.setId_persona(5);
		
		dao.eliminar(p1);
	}
}