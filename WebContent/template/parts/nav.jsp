        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Mi Empresa Logo</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
          
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item ">
                  <a class="nav-link active" href="Home">Panel</a>
                </li>
                <li class="nav-item ">
                  <a class="nav-link" href="perfil">Mi Perfil</a>
                </li>
              </ul>
              <div>
              <p>Bienvenido <c:out value="${sessionScope.nombre_usuario}"/></p>
                	<div class="text-white"><button data-toggle="modal" data-target="#salirModal" class="btn bg-transparent text-dark">Logout</button></div>
              </div>
            </div>
          </nav>