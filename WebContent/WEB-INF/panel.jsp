<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>

<jsp:include page='../template/header.jsp'>
<jsp:param name='title' value='Panel' />
<jsp:param name='description' value='Panel' />
</jsp:include>   

    <main style="">
    <header>
		<%@ include file="../template/parts/nav.jsp" %>	
    </header>
    <div class="separator-50"></div>
    <div class="container">
        <div class="row">
            <div class="col-md-3 mb-3">
                <div class="card shadow bg-warning">
                    <div class="card-body text-center">
                      <h5 class="card-title">Mi Perfil de   </h5>
                      <a href="${pageContext.request.contextPath}/perfil" class="btn btn-primary">Ver Perfil</a>
                      
                    </div>
                  </div>
            </div>
            <div class="col-md-3 mb-3">
                <div class="card shadow bg-warning">
                    <div class="card-body text-center">
                      <h5 class="card-title">Ver Accidentes</h5>
                      <a href="${pageContext.request.contextPath}/accidentes" class="btn btn-primary">Ver Accidentes</a>
                      
                    </div>
                  </div>
            </div>
            <div class="col-md-3 mb-3">
                <div class="card shadow bg-warning">
                    <div class="card-body text-center">
                      <h5 class="card-title">Ver Usuarios</h5>
                      <a href="${pageContext.request.contextPath}/usuarios" class="btn btn-primary">Ver Usuarios</a>
                      
                    </div>
                  </div>
            </div>
              <div class="col-md-3 mb-3">
                <div class="card shadow bg-warning">
                    <div class="card-body text-center">
                      <h5 class="card-title">Ver Personas</h5>
                      <a href="${pageContext.request.contextPath}/personas" class="btn btn-primary">Ver Personas</a>
                      
                    </div>
                  </div>
            </div>
            <div class="col-md-3 mb-3">
                <div class="card shadow bg-warning">
                    <div class="card-body text-center">
                      <h5 class="card-title">Roles</h5>
                      <a href="${pageContext.request.contextPath}/roles" class="btn btn-primary">Ver Roles</a>
                      
                    </div>
                  </div>
            </div>
        </div>
        <div class="separator-50"></div>
        <div class="row">
            <div class="col-md-12">
               
            </div>
        </div>
        <div class="separator-50"></div>
    </div>
    </main>

<%@ include file="../template/footer.jsp"%>