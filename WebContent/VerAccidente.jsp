<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver Accidentes</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,500;1,700&display=swap"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row mx-auto">
			<div class="col-md-12 mx-auto">
				<div class="card shadow">
					<div class="card-body">
						<div class="row">
							<div class="col-md-12">
								<h2 class="py-4 mt-4 text-center">HISTORIAL DE ACCIDENTES</h2>
							</div>
						</div>
						<div class="row">
							<table id="verAccidente" class="col-md-12 table table-hover">
								<thead>
									<tr class="bg-primary text-light">
									    <th scope="col">Reg</th>
										<th scope="col">Registrante</th>
										<th scope="col">Nombre</th>
										<th scope="col">Apellido</th>
										<th scope="col">Cargo</th>
										<th scope="col">Teléfono</th>
										<th scope="col">Dirección</th>
										<th scope="col">Fecha</th>
										<th scope="col">Previsión</th>
										<th scope="col">Tipo</th>
										<th scope="col">Descripción</th>
										<th scope="col">Acciones</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<c:forEach var="datos" items="${datos}">
											<tr>
												<td scope="row">${datos.getsId_Acc()}</td>
												<td>${datos.getNombreRegistrante()}</td>
												<td>${datos.getNombreAccidentado()}</td>
												<td>${datos.getApellidoAccidentado()}</td>
												<td>${datos.getsCargo()}</td>
												<td>${datos.getsTelefono()}</td>
												<td>${datos.getsDireccion()}</td>
												<td>${datos.getsF_Acc()}</td>
												<td>${datos.getsNomSis()}</td>
												<td>${datos.getsTipoAc()}</td>
												<td>${datos.getsDescripccion()}</td>

												<td>
													<form action="controlador" method="post">
														<input type="hidden" name="id" value="${datos.getsId_Acc()}">
														<button type="submit" name="accion" value="Editar"
															class="btn btn-primary">Editar</button>
														<button type="submit" name="accion" value="Eliminar"
															class="btn btn-primary">Eliminar</button>
													</form>
												</td>
											</tr>

										</c:forEach>
								</tbody>
							</table>
							<form action="controlador" method="post">
								<div class="form-group">

									<button type="submit" name="action" value="Lista Accidente"
										class="btn btn-primary">Recargar</button>
									<button type="submit" name="accion" value="Agregar"
										class="btn btn-primary">Agregar</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>



		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
			integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
			integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
			crossorigin="anonymous"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
			integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
			crossorigin="anonymous"></script>
</body>
</html>