package com.proyectom4.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proyectom4.dto.PersonaDto;
import com.proyectom4.dto.UsuarioDto;
import com.proyectom4.model.JDBCUsuarioDao;
import com.proyectom4.model.UsuarioDao;

/**
 * Servlet implementation class ListarPerfil
 */
@WebServlet("/perfil")
public class ListarPerfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarPerfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if (session.getAttribute("nombre_usuario") == null || session.getAttribute("nombre_usuario").equals("")) {
			//PrintWriter out = response.getWriter();
			//request.setAttribute("mensaje", "Comprobar Inicio de Sesión");
			request.setAttribute("mensaje", "Acceso Denegado");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}else {
			try {
				UsuarioDao dao = new JDBCUsuarioDao();
					
				List<UsuarioDto> usuario = dao.selectByNombreUsuario(session.getAttribute("nombre_usuario"));
				request.setAttribute("datos", usuario);
				request.setAttribute("section", "Listado de Personas");
				request.setAttribute("add", "Agregar Persona");
				request.getRequestDispatcher("perfil.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
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
