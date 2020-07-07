<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ingresar Accidente</title>
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
			<div class="col-md-8 mx-auto">
				<div class="card shadow">
					<div class="card-body">
						<form action="controlador" method="post" class="p-3"
							id="agregarAccidente">
							<h2 class="pb-4">Ingresar Nuevo Accidente</h2>

							<div class="form-group row ">
								<div class="col-md-2 ">
									<label for="">Nº</label> <input type="text"
										name="numeroRegistro" class="form-control"
										required>
								</div>
								<div class="col-md-10">
									<label for="">Nombre Registrador</label> <input type="text"
										name="registradorRegistro" class="form-control"
									 required>
								</div>
							</div>

							<div class="form-group row ">
								<div class="col-md-6">
									<label for="">Nombre</label> <input type="text"
										name="nombreRegistro" value="${datos.getNombreAccidentado()}"  required
										class="form-control">
								</div>
								<div class="col-md-6">
									<label for="">Apellido</label> <input type="text"
										name="apellidoRegistro"
										value="${datos.getApellidoAccidentado()}" class="form-control" required>
								</div>
							</div>

							<div class="form-group row ">
								<div class="col-md-6">
									<label for="">Cargo en la Empresa</label> <input type="text"
										name="cargoRegistro" value="${datos.getCargoAccidentado()}"
										class="form-control" required>
								</div>
								<div class="col-md-6">
									<label for="">Teléfono</label> <input type="text"
										name="telefonoRegistro"
										value="${datos.getTelefonoAccidentado()}" class="form-control" required>
								</div>
							</div>
							<div class="form-group row ">
								<div class="col-md-8">
									<label for="">Dirección</label> <input type="text"
										name="direccionRegistro"
										value="${datos.getDireccionAccidentado()}"
										class="form-control" required>
								</div>
								<div class="col-md-4">
									<label for="">Fecha Accidente</label> <input type=date
										name="fechaRegistro" value="${datos.getFechaAccidentado()}"
										class="form-control" required>
								</div>
							</div>

							<div class="form-group row">
								<div class="col-md-6">
									<label for="">Tipo Accidente</label> <select
										class="form-control" name="tipoRegistro" required
										value="${datos.getTipoAccidentado()}">
										<option value="" disabled>Seleccione una opcion</option>
										<option value="1">Corte</option>
										<option value="2">Químico</option>
										<option value="3">Golpe</option>
									</select><br>
									<br>
								</div>
								<div class="col-md-6">
									<label for="">Sistema Previsional</label> <select
										class="form-control" name="sistemaRegistro" required
										value="${datos.getSistemaAccidentado()}">
										<option value="" disabled>Seleccione una opcion</option>
										<option value="1">Isapre</option>
										<option value="2">Fonasa</option>
									</select><br>
									<br>
								</div>

								<div class="col-md-12 text-center ">
									<label for="name">Descripcion del accidente</label><br />
									<textarea class="form-control" name="descripcionRegistro"
										value="${datos.getDescripcionAccidentado()}" rows="2"></textarea>
								</div>

							</div>

							<div class="form-group row ">
								<div class="col-md-7 ">
									<button class="btn btn-primary btn-lg " name="action" value="Agregar Accidente" type="submit">Guardar
										Registro</button>
								</div>

								<a href="verAccidente.jsp">
									<div class="col-md-2 ">
										<button class="btn btn-primary btn-lg " type="button">Regresar</button>
									</div>
								</a>

								<div class="col-md-1 ">
									<button class="btn btn-primary btn-lg " type="reset">limpiar</button>
								</div>
							</div>



						</form>
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
