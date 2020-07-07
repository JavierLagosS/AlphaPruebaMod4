package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Persona;
import modelo.PersonaDao;
import java.lang.*;
/**
 * Servlet implementation class ProcesarDelete
 */
@WebServlet("/ProcesarDelete")
public class ProcesarDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesarDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id_persona = request.getParameter("id_persona");
		int idP = Integer.parseInt(id_persona);
		
		Persona p1 = new Persona();
		PersonaDao dao = new PersonaDao();
		
		try {
			p1.setId_persona(idP);
			
			dao.eliminar(p1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
