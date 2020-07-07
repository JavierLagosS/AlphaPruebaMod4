<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver Usuario | Empresa S.A</title>
<%@ include file="partials/linkshead.jsp"%>
</head>
<body>


	<header class="pb-2">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#">Mi Empresa Logo</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item "><a class="nav-link" href="#">Panel</a></li>
					<li class="nav-item active"><a class="nav-link" href="#">Ver
							Usuarios</a></li>
				</ul>
				<div>
					<a href="#" class="user"><i class="fa fa-user"></i></a>
				</div>
			</div>
		</nav>
	</header>


	<div class="container">
		<div class="row">
			<div class="col-md-12 mx-auto text-center">
				<div class="card">
					<div class="card-header bg-primary text-white">
						<h2>Ver usuarios</h2>
					</div>
					<div class="card-body">
						<table class="table" id="verUsuarios">
							<thead class="thead-dark">
								<tr>

									<th scope="col">#</th>
									<th scope="col">Nombre</th>
									<th scope="col">Apellido</th>
									<th scope="col">Email</th>
									<th scope="col">Telefono</th>
									<th scope="col">Direccion</th>
									<th scope="col">sistema previsional</th>
									<th scope="col">Editar</th>
									<th scope="col">Eliminar</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="datos" items="${datos}">
									<tr>
										<td scope="row">${datos.getId_persona()}</td>
										<td>${datos.getNombre()}</td>
										<td>${datos.getApellido()}</td>
										<td>${datos.getEmail()}</td>
										<td>${datos.getTelefono()}</td>
										<td>${datos.getDireccion()}</td>
										<td>${datos.getPrevision()}</td>



										<td>

												<button  name="action" class="btn editarPersona " type="submit" value="Editar" data-toggle="modal" data-target="#editarPersonaModal"
												  >
													<img src="assets/img/edit.png" alt="editar" height="auto"
														width="40px" class="img-fluid">
														
												</button>
										</td>
										<td>
											<button   name="action" class="btn eliminarPersona " type="submit" value="Eliminar" data-toggle="modal" data-target="#eliminarPersonaModal"
											>
												<img src="assets/img/delete.png" alt="eliminar"
													height="auto" width="30px" class="img-fluid">
											</button>
										</td>
									</tr>



								</c:forEach>
							</tbody>
						</table>
						<form action="controlador" method="post">
							<div class="form-group">

								<button type="submit" name="action" value="Ver Perfil"
									class="btn btn-primary">Recargar</button>

							</div>
						</form>

						<!-- <hr>
                  // version alpha de botones 
                <div class="row ">
                  
                    <div class="col-md-6 text-left">
                      
                      <button type="submit" class="btn btn-danger " > Eliminar </button>
                    </div>
                    <div class="col-md-6 text-right">
                      <button type="submit" class="btn btn-primary" > Editar </button>
                      
                    </div>
                    
                  
                </div>

                        -->
					</div>
				</div>
			</div>
		</div>

	</div>
	<div class="modal fade" id="eliminarPersonaModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Editar Persona</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <form id="procesarEliminarPersona">
      <div class="modal-body">
      	
         
            <input type="hidden" name="persona_activacion">
            <input type="hidden" name="id_persona">
      
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
        <button id="agregarRolBtn" type="submit" class="btn btn-success">Guardar</button>
      </div>
      </form>
    </div>
  </div>
</div>
	
	
	
	<%@ include file="partials/linksbody.jsp"%>
</body>
</html>