package com.proyectom4.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyectom4.dto.UsuarioDto;
import com.proyectom4.model.JDBCUsuarioDao;
import com.proyectom4.model.UsuarioDao;

import java.lang.*;
import java.sql.SQLException;

/**
 * Servlet implementation class EliminarUsuario
 */
@WebServlet("/eliminarusuario")
public class EliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// TODO Auto-generated method stub
		
		String id_usuario = request.getParameter("id_usuario");
		
		int idU = Integer.parseInt(id_usuario);
		UsuarioDao dao = new JDBCUsuarioDao();
		
		UsuarioDto u = new UsuarioDto();
		
		u.setId_usuario(idU);
		
		try {
			dao.delete(u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
