package controlador;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import modelo.AccPersona;
import modelo.AccidenteDao;
import modelo.Persona;
import modelo.PersonaDao;
import modelo.Usuario;
import modelo.UsuarioDao;


@WebServlet("/controlador")
public class controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	PersonaDao pdao = new PersonaDao();
	Persona p = new Persona();
	AccidenteDao adao = new AccidenteDao();
	AccPersona ap = new AccPersona();
	Usuario u = new Usuario();
	UsuarioDao udao = new UsuarioDao();

    public controlador() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		switch (action) {
			
		case "Ver Perfil":
			List<Persona> datosp = pdao.listar();
			request.setAttribute("datos", datosp);
			request.getRequestDispatcher("VerUsuario.jsp").forward(request, response);
			break;
		case "Solicitar Modificacion":
			String idp = request.getParameter("");
			String nomp = request.getParameter("");
			String apep = request.getParameter("");
			String emailp = request.getParameter("");
			String telefonop = request.getParameter("");
			String direccionp = request.getParameter("");
			String rolp = request.getParameter("");
			String sisp = request.getParameter("");
			// la persona solo podia solicitar?
			break;
		case "Ver Usuarios":
			List<Usuario> datosu = udao.listar();
			request.setAttribute("datos", datosu);
			request.getRequestDispatcher("verUsuario.jsp").forward(request, response);
			break;
		case "Editar":
			request.getRequestDispatcher("editarUsuario.jsp").forward(request, response);
			break;
		case "Eliminar":
			String idu = request.getParameter("datos");
			udao.eliminarU(idu);
			request.getRequestDispatcher("controlador?action=Ver Usuarios").forward(request, response);
			break;
		case "Modificar":
			
			String idu2 = request.getParameter("");
			String nomu = request.getParameter("");
			String apeu = request.getParameter("");
			String passu = request.getParameter("");
			String emailu = request.getParameter("");
			String telu = request.getParameter("");
			String diru = request.getParameter("");
			
			u.setId_usuario(idu2);
			u.setRoles_id_rol(nomu);
			u.setPersona_id_persona(apeu);
			u.setNombre_usuario(passu);
			u.setPassword_usuario(emailu);
			
			
			
			
			udao.modificarU(u);
			request.getRequestDispatcher("controlador?action=Ver Usuarios").forward(request, response);
			break;
		case "Lista Accidente":
			try {
				List<AccPersona> datosa = adao.listar();
				request.setAttribute("datos", datosa);
				request.getRequestDispatcher("VerAccidente.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "Agregar Accidente":
			request.getRequestDispatcher("AgregarAccidente.jsp").forward(request, response);
			break;
		case "Ingresar Accidente":
			String ida = request.getParameter("numeroRegistro");
			String prea = request.getParameter("sistemaRegistro");
			String tipoa = request.getParameter("tipoRegistro");
			String fea = request.getParameter("fechaRegistro");
			String cara = request.getParameter("cargoRegistro");
			String desa = request.getParameter("descripcionRegistro");
			
			ap.setId_registro_accidente(ida);
			ap.setSistema_previsional_id_sistema(prea);
			ap.setTipo_id_tipo(tipoa);
			ap.setFecha_accidente(fea);
			ap.setCargo_accidentado(cara);
			ap.setDescripcion(desa);
			
			adao.agregarAcc(ap);
			request.getRequestDispatcher("controlador?action=Lista Accidente").forward(request, response);
			break;
		case "Editar accidente":
			request.getRequestDispatcher("EditarAccidente.jsp").forward(request, response);
			break;
		case "Modificar Accidente":
			String ida3 = request.getParameter("numeroRegistro");
			String prea2 = request.getParameter("sistemaRegistro");
			String tipoa2 = request.getParameter("tipoRegistro");
			String fea2 = request.getParameter("fechaRegistro");
			String cara2 = request.getParameter("cargoRegistro");
			String desa2 = request.getParameter("descripcionRegistro");
			
			
			ap.setId_registro_accidente(ida3);
			ap.setSistema_previsional_id_sistema(prea2);
			ap.setTipo_id_tipo(tipoa2);
			ap.setFecha_accidente(fea2);
			ap.setCargo_accidentado(cara2);
			ap.setDescripcion(desa2);
			
			adao.actualizarAcc(ap);
			request.getRequestDispatcher("controlador?action=Lista Accidente").forward(request, response);
			break;
		case "Eliminar registro Accidente":
			String ida5 = request.getParameter("");
			adao.eliminarAcc(ida5);
			request.getRequestDispatcher("controlador?action=Lista Accidente").forward(request, response);
			break;
		}
		
	}

}
