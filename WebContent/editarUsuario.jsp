<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Usuario | Empresa S.A</title>
<%@ include file="partials/linkshead.jsp" %>
</head>
<body>
    <header class="pb-2">
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <a class="navbar-brand" href="#">Mi Empresa Logo</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
        
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
              <li class="nav-item ">
                <a class="nav-link" href="#">Panel</a>
              </li>
              <li class="nav-item ">
                <a class="nav-link" href="verUsuario.jsp">Ver Usuarios</a>
              </li>
              <li class="nav-item active">
                <a  class="nav-link" href="#">Editar Usuario</a>
              </li>
            </ul>
            <div>
              <a href="#" class="user"><i class="fa fa-user"></i></a>
            </div>
          </div>
        </nav>
  </header>
  
    <div class="container shadow p-5">
      <div class="row">
          <div class="col-md-12 mx-auto">
              <div class="card">
                  <div class="card-header bg-primary text-white">
                      <h2>Editar  usuario</h2>
                  </div>
                  <div class="card-body">
                  
                      <form name="editarUsuarios" id="editarUsuarios" method="POST">
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

                            <div class="form-group col-md-6">
                              <label for="telefono">Telefono</label>
                              <input type="text" class="form-control" id="Telefono" required>
                            </div>
                          </div>
                          <div class="form-row">
                            <div class="form-group col-md-6">
                              <label for="direccion">Direccion</label>
                              <input type="text" class="form-control" id="direccion" required>
                            </div>
                            <div class="form-group col-md-6">
                              <label for="nombre-rol">Selecionar Rol</label>
                              <select class="custom-select mr-sm-2" id="nombre_rol" required>
                                <option  disabled>elegir</option>
                                <option  value="usuario"  selected>Usuario</option>
                                <option value="admin">admin</option>
                              </select>
                            </div>
                          </div>
            
                          <div class="form-group">
                            <div class="form-check">
                              <input class="form-check-input" type="checkbox" id="gridCheck" required>
                              <label class="form-check-label" for="gridCheck">
                                Confirmar Edicion
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
<%@ include file="partials/linksbody.jsp" %>
</body>
</html>