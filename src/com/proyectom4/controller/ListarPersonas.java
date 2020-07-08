package com.proyectom4.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.proyectom4.dto.PersonaDto;
import com.proyectom4.model.JDBCPersonaDao;
import com.proyectom4.model.PersonaDao;
import java.util.List;

/**
 * Servlet implementation class ListarPersonas
 */
@WebServlet("/personas")
public class ListarPersonas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PersonaDao dao  = new JDBCPersonaDao();
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		try {
			List<PersonaDto> personas = dao.select();
			request.setAttribute("datos", personas);
			request.setAttribute("section", "Listado de Personas");
			request.setAttribute("add", "Agregar Persona");
			request.getRequestDispatcher("personas.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
