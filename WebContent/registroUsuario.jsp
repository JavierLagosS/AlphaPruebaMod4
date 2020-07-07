<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro Usuario | Empresa S.A</title>
<%@ include file="partials/linkshead.jsp" %>
</head>
<body>
<!-- Registrar Usuario -->

<div class="container shadow p-5">
      <div class="row">
          <div class="col-md-12 mx-auto">
              <div class="card">
                  <div class="card-header bg-primary text-white">
                      <h2>Registro de usuario</h2>
                  </div>
                  <div class="card-body">
                      <form name="newRegister" id="newRegister" method="POST">
                          <div class="form-row">
                            <div class="form-group col-md-6">
                              <label for="nombre_usuario">Nombre de usuario</label>
                              <input type="text" class="form-control" id="nombre_usuario" required>
                            </div>
                            <div class="form-group col-md-6">
                              <label for="password_usuario">Contraseña</label>
                              <input type="password" class="form-control" id="password_usuario" required>
                            </div>
                          </div>
                          <div class="form-row">
                            <div class="form-group col-md-6">
                              <label for="nombre">Nombre</label>
                              <input type="text" class="form-control" id="nombre" required>
                            </div>
                            <div class="form-group col-md-6">
                              <label for="apellido">apellido</label>
                              <input type="text" class="form-control" id="apellido" required>
                            </div>
                          </div>
                          <div class="form-row">
                            <div class="form-group col-md-6">
                              <label for="mail">Correo ELectronico</label>
                              <input type="email" class="form-control" id="mail" required>
                            </div>
                            <div class="form-group col-md-2">
                              <label for="cod-area">cod-area</label>
                              <select class="custom-select mr-sm-2" id="cod-area" required>
                                <option selected>elegir</option>
                                <option value="1">+56</option>
                                <option value="2">+45</option>
                              </select>
                            </div>
                            <div class="form-group col-md-4">
                              <label for="telefono">Telefono</label>
                              <input type="number" class="form-control" id="Telefono" required>
                            </div>
                          </div>
                          <div class="form-row">
                            <div class="form-group col-md-12">
                              <label for="direccion">Direccion</label>
                              <input type="text" class="form-control" id="direccion" required>
                            </div>
                          </div>
            
                          <div class="form-group">
                            <div class="form-check">
                              <input class="form-check-input" type="checkbox" id="gridCheck" required>
                              <label class="form-check-label" for="gridCheck">
                                Acepto las condiciones de uso 
                              </label>
                            </div>
                          </div>
                          <button type="submit" id="registrar" class="btn btn-primary">Registrar usuario</button>
                        </form>
                  </div>
              </div>
          </div>
      </div>
      </div>

<!-- fin  Registrar usuario -->


<%@ include file="partials/linksbody.jsp" %>
</body>
</html>
    