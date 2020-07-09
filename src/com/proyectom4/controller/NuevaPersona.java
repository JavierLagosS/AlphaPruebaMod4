package com.proyectom4.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyectom4.dto.PersonaDto;
import com.proyectom4.model.JDBCPersonaDao;
import com.proyectom4.model.PersonaDao;

/**
 * Servlet implementation class NuevaPersona
 */
@WebServlet("/nuevapersona")
public class NuevaPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PersonaDto p = new PersonaDto();
		PersonaDao dao = new JDBCPersonaDao();
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String sistema_prevision = request.getParameter("sistema_prevision");
		
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setEmail(email);
		p.setTelefono(telefono);
		p.setDireccion(direccion);
		p.setSistema_prevision(sistema_prevision);
		
		try {
			dao.insert(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
