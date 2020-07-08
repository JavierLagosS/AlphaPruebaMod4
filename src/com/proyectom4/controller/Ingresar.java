package com.proyectom4.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyectom4.model.AutenticationDao;
import com.proyectom4.model.JDBCAutenticationDao;
import javax.servlet.http.HttpSession;

@WebServlet("/Ingresar")
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
		
		AutenticationDao dao = new JDBCAutenticationDao();
		String nombre_usuario = request.getParameter("nombre_usuario");
		String password_usuario = request.getParameter("password_usuario");
		
		boolean datosIngreso = dao.autenticacionPersona(nombre_usuario, password_usuario);
		boolean datosIngreso2 = dao.autenticacionAdmin(nombre_usuario, password_usuario);
		
		// almacenando al informacion o parametro en sesion
        HttpSession session = request.getSession();
        session.setAttribute("nombre_usuario", nombre_usuario);
        session.setAttribute("password_usuario", password_usuario);
        
		try {
			if (datosIngreso) {
				request.getRequestDispatcher("perfil.jsp").forward(request, response);
			}else if (datosIngreso2) {
				response.sendRedirect("Home");
				
			}else{
				//request.setAttribute("mensaje", "Comprobar Inicio de Sesión");
				request.setAttribute("mensaje", "Verificar Credenciales");
				request.getRequestDispatcher("error.jsp").forward(request, response);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		
		
	}

}