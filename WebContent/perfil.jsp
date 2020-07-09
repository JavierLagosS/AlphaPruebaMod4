
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page='template/header.jsp'>
<jsp:param name='title' value='Formulario Registro de Accidente' />
<jsp:param name='description' value='Aca se registra formulario' />
</jsp:include>
	<main>
    <header>
        <%@ include file="template/parts/nav.jsp" %>	
    </header>
    <div class="separator-50"></div>
    <div class="container">
        <div class="row">
            <div class="col-md-12 mx-auto">
                <div class="card shadow">
                    <div class="card-header bg-primary text-white">
                        <h2>Mi Perfil</h2>
                    </div>
                    <div class="card-body">
                        <form action="" id="miPerfil">
                        <c:forEach var="datos" items="${datos}">
                            <div class="form-group row">
                                
                                <div class="col-md-6">
                                    <label for="nombre">Nombre</label>
                                    <input id="nombre" class="form-control" type="text" name="nombre" value="${datos.getNombre()}" disabled>
                                </div>
                                <div class="col-md-6">
                                    <label for="apellido">Apellido</label>
                                    <input id="apellido" class="form-control" type="text" name="apellido" value="${datos.getApellido()}" disabled>
                                </div>
                            </div>
                            <div class="form-group row">
                                
                                <div class="col-md-6">
                                    <label for="email">Email</label>
                                    <input id="email" class="form-control" type="text" name="email" value="${datos.getEmail()}" disabled>
                                </div>
                                <div class="col-md-6">
                                    <label for="telefono">Teléfono</label>
                                    <input id="telefono" class="form-control" type="text" name="telefono" value="${datos.getTelefono()}" disabled>
                                </div>
                            </div>
                            <div class="form-group row">                                
                                <div class="col-md-6">
                                    <label for="direccion">Dirección</label>
                                    <input id="direccion" class="form-control" type="text" name="direccion" value="${datos.getDireccion()}" disabled>
                                </div>
                                <div class="col-md-6">
                                    <label for="nombre_sistema">Sistema Previsional</label>
                                    <input id="nombre_sistema" class="form-control" type="text" name="nombre_sistema" value="${datos.getSistema_prevision()}"  disabled>
                                </div>
                                
                            </div>    
                            <div class="form-group row">                                
                                <div class="col-md-6">
                                    <label for="nombre_rol">Rol</label>
                                    <input id="nombre_rol" class="form-control" type="text" name="nombre_rol" value="${datos.getNombre_rol()}" disabled>
                                </div>
                                <div class="col-md-6">
                                    <label for="nombre_usuario">Username</label>
                                    <input id="nombre_usuario" class="form-control" type="text" name="nombre_usuario" value="pepitotv02"  disabled>
                                </div>
                                
                            </div> 
                            </c:forEach>
                            <button type="button" id="solicitarModificacion" class="btn btn-success my-3 float-right">Solicitar Modificación</button>                      
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="separator-50"></div>
        <div class="row">
            <div class="col-md-12">
                <div class="card shadow">
                    <div class="card-header bg-primary text-white">
                       <h2> Mi historial de registros de accidentes</h2>
                    </div>
                    <div class="card-body">
                        <table class="table table-light" id="miHistorial">
                            <thead class="thead-light">
                                <tr>
                                    <th>#</th>
                                    <th>id_registro_accidente</th>
                                    <th>Cargo</th>
                                    <th>Fecha de Accidente</th>
                                    <th>Previsi�n</th>
                                    <th>Tipo de Accidente</th>
                                    <th>Descripci�n</th>
                                    <th>Registrado Por</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>2</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>3</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                </tr>
                                <tr>
                                    <td>2</td>
                                    <td>100</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                    <td>Lorem, ipsum.</td>
                                </tr>
                            </tbody>
                            <tfoot>
                                <tr>
                                    <th>#</th>
                                    <th>id_registro_accidente</th>
                                    <th>Cargo</th>
                                    <th>Fecha de Accidente</th>
                                    <th>Previsi�n</th>
                                    <th>Tipo de Accidente</th>
                                    <th>Descripci�n</th>
                                    <th>Registrado Por</th>
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
  <footer>
        <div><p class="text-center">&copy; Sistema v.00001 Registros de Accidentes.</p></div>
    </footer>
<%@ include file="template/footer.jsp"%>
