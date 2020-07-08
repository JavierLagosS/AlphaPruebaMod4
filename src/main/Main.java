package main;

import modelo.Persona;
import modelo.PersonaDao;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona();
		PersonaDao pd= new PersonaDao();
		
		
		int id_persona = 1;
		
		p.setId_persona(id_persona );

		
		pd.eliminar(id_persona);
	}
}
