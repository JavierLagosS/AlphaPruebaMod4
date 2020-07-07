<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page='template/header.jsp'>
	<jsp:param name='title' value='Panel' />
	<jsp:param name='description' value='Panel' />
</jsp:include>
<main>
	<header>
		<%@ include file="template/parts/nav.jsp"%>
	</header>
	<div class="separator-50"></div>
	<div class="container">

		<div class="row">
			<div class="col-md-8 mx-auto">
				<div class="card shadow">
					<div
						class="card-header bg-primary text-white d-flex justify-content-between">
						<h2>Usuarios</h2>
						<button class="btn btn-success" data-toggle="modal"
							data-target="#agregarUsuario">
							<i class="fa fa-plus"></i>
						</button>
					</div>
					<div class="card-body">
						<table class="table table-light table-hover" id="miHistorial">
							<thead class="thead-light">
								<tr>

									<th>ID</th>
									<th>USER</th>
									<th>PASSWORD</th>
									<th>Datos Personales</th>
									<th>Administrar</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="datos" items="${datos}">
									<tr>
										<td>${datos.getId_usuario()}</td>
										<td hidden="hidden">${datos.getPersona_id_persona()}</td>
										<td>${datos.getNombre_usuario()}</td>
										<td>${datos.getPassword_usuario()}</td>
										<td class="text-center"><button
												class="btn btn-warning getDatosPersonales"
												data-toggle="modal" data-target="#verDatosPersonales">
												<i class="fa fa-eye"></i>
											</button></td>
										<td>
											<!--  CAPTURAMOS EL ID LO ESCONDEMOS Y POR EL METODO POST LO PASAMOS AL CONTROLADOR  -->

											<button class="btn btn-warning">
												<i class="fa fa-edit"></i>
											</button>
											<button class="btn btn-danger">
												<i class="fa fa-trash"></i>
											</button>
										</td>
									</tr>
								</c:forEach>
							</tbody>
							<tfoot>
								<tr>
									<th>ID</th>
									<th>USER</th>
									<th>PASSWORD</th>
									<th>Datos Personales</th>
									<th>Administrar</th>
								</tr>
							</tfoot>
						</table>
					</div>
				</div>
			</div>
		</div>
		<div class="separator-50"></div>
	</div>
</main>
<div class="modal fade" id="agregarUsuario" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLongTitle">Agregar
					usuario</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form id="agregarUser">
				<div class="modal-body">

					<div class="form-group">
						<div class="col-md-12">
							<label>Usuario</label> <input type="text" class="form-control"
								name="usuario_nombre" placeholder="Ingrese un nombre de usuario">
						</div>
						<div class="col-md-12">
							<label>Password</label> <input type="password"
								class="form-control" name="usuario_password"
								placeholder="Ingrese un password">
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
<div class="modal fade" id="verDatosPersonales" tabindex="-1"
	role="dialog" aria-labelledby="exampleModalCenterTitle"
	aria-hidden="true">
	<div class="modal-dialog modal-lg modal-dialog-centered" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLongTitle">Datos de
					Persona</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form id="agregarPersona">
				<div class="modal-body">
					<div>
						<ul  id="somediv"></ul>
					</div>
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
							<label for="cod-area">cod-area</label> <select name="cod_area"
								class="custom-select mr-sm-2" id="cod-area" required>
								<option selected>elegir</option>
								<option value="1">+56</option>
								<option value="2">+45</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-md-6">
							<label for="telefono">Telefono</label> <input type="number"
								name="telefono" class="form-control" id="Telefono" required>

						</div>
						<div class="col-md-6">
							<label for="direccion">Direccion</label> <input type="text"
								name="direccion" class="form-control" id="direccion" required>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-md-12">
							<label for="telefono">Sistema Previsional</label> <input
								type="text" name="sistema_prevision" class="form-control"
								id="sistema_prevision" required>
						</div>
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
