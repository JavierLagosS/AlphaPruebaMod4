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

/**
 * Servlet implementation class GetDataPersona
 */
@WebServlet("/obtenerjsonpersona")
public class GetDataPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDataPersona() {
        super();
        // TODO Auto-generated constructor stub
    }


}
