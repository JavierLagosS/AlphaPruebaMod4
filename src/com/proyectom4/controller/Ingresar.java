package com.proyectom4.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyectom4.model.UsuarioDao;

import login.Usuario;
import login.consultaControlador;

/**
 * Servlet implementation class Ingresar
 */
@WebServlet("/ingresar")
public class Ingresar extends HttpServlet {
	private static final long serialVersionUID = 1L;
 


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
	
		UsuarioDao dao = new UsuarioDao();
		consultaControlador co = new consultaControlador();
		
		if(co.isAdmin(user) !=null ) {    //co.exist(user) != null && 
			out.println("Hola Admin");
 		}else {
 			out.println("chao jefe");
		}
		
	}

}
