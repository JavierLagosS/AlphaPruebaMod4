package com.proyectom4.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyectom4.model.UsuarioDao;
import com.proyectom4.model.JDBCUsuarioDao;
import com.proyectom4.dto.UsuarioDto;
/**
 * Servlet implementation class ListarUsuarios
 */
@WebServlet("/usuarios")
public class ListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		UsuarioDao dao  = new JDBCUsuarioDao();
		  response.setContentType("text/html;charset=UTF-8");
		// TODO Auto-generated method stub
		try {
			List<UsuarioDto> usuarios = dao.select();
			request.setAttribute("datos", usuarios);
			request.getRequestDispatcher("usuarios.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
