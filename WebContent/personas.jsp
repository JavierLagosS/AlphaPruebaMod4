<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page='template/header.jsp'>
<jsp:param name='title' value='Panel' />
<jsp:param name='description' value='Panel' />
</jsp:include>    
    <header>
		<%@ include file="template/parts/nav.jsp" %>	
    </header>
	<div class="separator-50"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-12 mx-auto text-center">
				<div class="card">
					<div
						class="card-header bg-primary text-white d-flex justify-content-between">
						<h2>${section}</h2>
						<button class="btn btn-success" data-toggle="modal"
							data-target="#agregarPersonaModal">
							<i class="fa fa-plus"></i>
						</button>
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
										<td>${datos.getSistema_prevision()}</td>



										<td>

											<button name="action" class="btn editarDatosPersona "
												type="submit" value="Editar" data-toggle="modal"
												data-target="#editarDatosPersonaModal">
												<i class="fa fa-edit"></i>

											</button>
										</td>
										<td>
											<button name="action" class="btn eliminarPersona "
												type="submit" value="Eliminar" data-toggle="modal"
												data-target="#eliminarPersonaModal">
												<i class="fa fa-trash"></i>
											</button>
										</td>
									</tr>



								</c:forEach>
							</tbody>
						</table>

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
	<!--  agregar una nueva persona -->
	<div class="modal fade" id="agregarPersonaModal" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalCenterTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">Agregar
						Datos de Persona</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				
				<form id="agregarPersona">
					<div class="modal-body">

						<div class="form-group row">
							<div class="col-md-6">
								<label for="nombre">Nombre</label> <input type="text"
									class="form-control" id="nombre" name="nombre" required>

							</div>
							<div class="col-md-6">
								<label for="apellido">apellido</label> <input type="text"
									class="form-control" id="apellido" name="apellido" required>
							</div>
						</div>
						<div class="form-group row">
							<div class="col-md-6">
								<label for="mail">Correo ELectronico</label> <input type="email"
									class="form-control" id="mail" name="email" required>

							</div>
							<div class="col-md-6">
								<label for="telefono">Telefono</label> <input type="number"
									name="telefono" class="form-control" id="Telefono" required>

							</div>
						</div>
						<div class="form-group row">

							<div class="col-md-6">
								<label for="direccion">Direccion</label> <input type="text"
									name="direccion" class="form-control" id="direccion" required>
							</div>
														<div class="col-md-6">
								<label for="telefono">Sistema Previsional</label> <input
									type="text" name="sistema_prevision" class="form-control"
									id="sistema_prevision" required>
							</div>
						</div>
						<div class="form-group row">

						</div>
						<div class="form-group row">
							<div class="col-md-12">
								<div class="form-check">
									<input class="form-check-input" type="checkbox" id="gridCheck"
										required> <label class="form-check-label"
										for="gridCheck"> Acepto las condiciones de uso </label>
								</div>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Cancelar</button>
						<button id="agregarUserBtn" type="submit" class="btn btn-success">Guardar</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Editar una persona vista Persona -->
	<div class="modal fade" id="editarDatosPersonaModal" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalCenterTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">Agregar
						Datos de Persona</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				
				<form id="EditarPersonaPersona">
					<div class="modal-body">

						<div class="form-group row">
							<div class="col-md-6">
								<label for="nombre">Nombre</label> <input type="text"
									class="form-control" id="nombre" name="nombre" required>

							</div>
							<div class="col-md-6">
								<label for="apellido">apellido</label> <input type="text"
									class="form-control" id="apellido" name="apellido" required>
							</div>
						</div>
						<div class="form-group row">
							<div class="col-md-6">
								<label for="mail">Correo ELectronico</label> <input type="email"
									class="form-control" id="mail" name="email" required>

							</div>
							<div class="col-md-6">
								<label for="telefono">Telefono</label> <input type="number"
									name="telefono" class="form-control" id="Telefono" required>

							</div>
						</div>
						<div class="form-group row">

							<div class="col-md-6">
								<label for="direccion">Direccion</label> <input type="text"
									name="direccion" class="form-control" id="direccion" required>
							</div>
														<div class="col-md-6">
								<label for="telefono">Sistema Previsional</label> <input
									type="text" name="sistema_prevision" class="form-control"
									id="sistema_prevision" required>
							</div>
						</div>
						<div class="form-group row">

						</div>
						<div class="form-group row">
							<div class="col-md-12">
								<div class="form-check">
									<input class="form-check-input" type="checkbox" id="gridCheck"
										required> <label class="form-check-label"
										for="gridCheck"> Acepto las condiciones de uso </label>
								</div>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Cancelar</button>
						<button id="agregarUserBtn" type="submit" class="btn btn-success">Guardar</button>
					</div>
				</form>
			</div>
		</div>
	</div>



<%@ include file="template/footer.jsp"%>