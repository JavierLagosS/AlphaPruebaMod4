package com.proyectom4.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyectom4.dto.RegistroAccidenteDto;
import com.proyectom4.dto.UsuarioDto;
import com.proyectom4.model.JDBCUsuarioDao;
import com.proyectom4.model.RegistroAccidenteDao;
import com.proyectom4.model.UsuarioDao;

/**
 * Servlet implementation class ListarRegistroAccidente
 */
@WebServlet("/accidentes")
public class ListarRegistroAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("VerAccidente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
