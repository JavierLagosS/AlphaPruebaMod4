package com.proyectom4.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
private final String SQL_SELECT ="SELECT "
		+ "U.ID_USUARIO, "  //1
		+ "P.ID_PERSONA, " //2
		+ "R.ID_REGISTRO_ACCIDENTE AS REGISTRO, " //3
		+ "P.NOMBRE AS NOMBRE,"  //4
		+ " R.CARGO_ACCIDENTADO,"  //5
		+ "P.TELEFONO AS TELEFONO,"  //6
		+ "P.DIRECCION AS DIRECCION,"  //7
		+ "R.FECHA_ACCIDENTE AS FECHA, "  //8
		+ "T.NOMBRE_TIPO AS TIPO_ACCIDENTE,\r\n" +   //9
		"R.DESCRIPCION AS DESCRIPCION, "  //10
		+ "PR.ID_PERSONA, "  //11
		+ "PR.NOMBRE AS ACCIDENTADO, "  //12
		+ "PR.APELLIDO, "  //13
		+ "PR.SISTEMA_PREVISION" //14
		+ "FROM    REGISTRO_ACCIDENTE R\r\n" + 
		"INNER JOIN \r\n" + 
		"    (SELECT P.ID_PERSONA, P.NOMBRE, P.APELLIDO, P.SISTEMA_PREVISION FROM REGISTRO_ACCIDENTE R \r\n" + 
		"        INNER JOIN PERSONA P ON P.ID_PERSONA = R.PERSONA_ID_PERSONA) PR ON PR.ID_PERSONA = R.PERSONA_ID_PERSONA\r\n" + 
		"INNER JOIN USUARIO U ON U.ID_USUARIO = R.USUARIO_ID_USUARIO\r\n" + 
		"INNER JOIN PERSONA P ON P.ID_PERSONA = U.PERSONA_ID_PERSONA\r\n" + 
		"INNER JOIN TIPO T ON T.ID_TIPO = R.TIPO_ID_TIPO\r\n" + 
		"WHERE R.REGISTRO_ACCIDENTE_ACTIVACION = 1;";



+ "id_registro_accidente," //1
+ "fecha_accidente," //2
+ "cargo_accidentado," //3
+ "descripcion," //4
+ "usuario_id_usuario," //5
+ "tipo_id_tipo" //6
+ "persona_id_persona" //7
+ "FROM    REGISTRO_ACCIDENTE R\r\n" + 
"WHERE R.REGISTRO_ACCIDENTE_ACTIVACION = 1;";
/**
 * Servlet implementation class afaf
 */
@WebServlet("/afaf")
public class afaf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public afaf() {
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
		doGet(request, response);
	}

}
