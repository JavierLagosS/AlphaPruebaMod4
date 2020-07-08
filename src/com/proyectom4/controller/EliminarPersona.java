package com.proyectom4.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyectom4.dto.PersonaDto;
import com.proyectom4.model.JDBCPersonaDao;
import com.proyectom4.model.PersonaDao;
import java.lang.*;
import java.sql.SQLException;

/**
 * Servlet implementation class EliminarPersona
 */
@WebServlet("/EliminarPersona")
public class EliminarPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("ok.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String id_persona = request.getParameter("id_persona");
		
		PersonaDao dao = new JDBCPersonaDao();
		PersonaDto p = new PersonaDto();
			
		int idP = Integer.parseInt(id_persona);
		p.setId_persona(idP);
		try {
			if(dao.delete(p) != 0) {
				
				doGet(request, response);
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
