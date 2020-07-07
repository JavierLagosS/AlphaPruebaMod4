function procesarFormulario() {
	var nom = document.getElementById("nombre");
	var ape = document.getElementById("apellido");
	var telefono = document.getElementById("telefono");
	var direccion = document.getElementById("direccion");
	var ciudad = document.getElementById("ciudad");

	// div que contiene label y input
	var datosFono = document.getElementById("datosFono");

	if ((direccion.value).length >= 100) {
		direccion.after("la direccion tiene que ser mas corta")
	}
	if ((ciudad.value).length >= 30) {
		ciudad.after(" la ciudad tiene que ser mas corta en letras")
	}

	//validar nombre y apellidos
	var letters = /^[A-Za-z]+$/;
	nom.value.match(letters)
	if (nom.value.match(letters)) {

	} else {
		nom.after(" nombre incorrecto");
	}
	ape.value.match(letters)
	if (ape.value.match(letters)) {

	} else {
		ape.after(" apellido incorrecto");
	}

}
// Generamos las validaciones en vivo-
/*
                        //validamos el nombre
var nombre = document.getElementById("nombre");
nombre.addEventListener("keyup", function(){
var letters = /^[A-Za-z]+$/;
Queseanletras=nombre.value.match(letters);
if(Queseanletras){
    if ((nombre.value).length >= 5 && (nombre.value).length <= 30) {
        nombre.classList.remove('is-invalid');
        nombre.classList.add('is-valid');
    }else {
        // se agrega mensaje al div
        mensajeError.textContent = "verificar número";
        datosFono.appendChild(mensajeError);
        nombre.classList.remove('is-valid');
        nombre.classList.add('is-invalid');
        // telefono.after(" ingrese numero valido");
    }
}else{
    nombre.classList.remove('is-valid');
    nombre.classList.add('is-invalid');
}
});

                        //validamos el apellido
 var apellido = document.getElementById("apellido");
 apellido.addEventListener("keyup", function(){
 var letters = /^[A-Za-z]+$/;
 Queseanletras=apellido.value.match(letters);
 if(Queseanletras){
     if ((apellido.value).length <= 50) {
         apellido.classList.remove('is-invalid');
         apellido.classList.add('is-valid');
     }else {
         apellido.classList.remove('is-valid');
         apellido.classList.add('is-invalid');
         // telefono.after(" ingrese numero valido");
     }
 }else{
     apellido.classList.remove('is-valid');
     apellido.classList.add('is-invalid');
 }
 });




                                // validamos el telefono
// se genera div para mensaje error
var telefono = document.getElementById("telefono");


telefono.addEventListener("keyup", function () {
 var numeros = /^([0-9])+$/;
var queSeanNumeros=telefono.value.match(numeros);
    if(queSeanNumeros){
        if ((telefono.value).length >= 6 && (telefono.value).length <= 11) {
                telefono.classList.remove('is-invalid');
                telefono.classList.add('is-valid');
        }else{
        // se agrega mensaje al div
        mensajeError.textContent = "verificar número";
        datosFono.appendChild(mensajeError);
        telefono.classList.remove('is-valid');
        telefono.classList.add('is-invalid');
        // telefono.after(" ingrese numero valido");
    }}else{
        telefono.classList.remove('is-valid');
        telefono.classList.add('is-invalid');
    }
});

var fecha= document.getElementById("fecha");

fecha.addEventListener("keydown", function(){
    console.log(fecha.value)
    var RegExPattern = /^\d{2,4}\/\d{1,2}\/\d{1,2}$/;
    console.log(RegExPattern)
    if ((fecha.value.match(RegExPattern)) && (fecha!='')) {
         console.log("yes") 
        
    } else {
        console.log("no")
    }
});


var mensajeError = document.createElement("div");
// se agrega clase
mensajeError.setAttribute("class", "invalid-feedback");
// se agrega id
mensajeError.setAttribute("id", "mensajeErrorId");

// Login validacion 

 Entrar.addEventListener("click", function () {
    var user= document.getElementById("user");
    var pass= document.getElementById("pass");

console.log("succes")

  if(user.value=="admin"){
    if(pass.value=="admin"){
      console.log("success")
	Swal.fire({
  position: 'top-end',
  icon: 'success',
  title: 'Usuario correcto',
  showConfirmButton: false,
  timer: 1500
})
 //setTimeout('window.location.replace("index.jsp")',2000);
 ;
    }
   
  }else{
	Swal.fire({
  icon: 'error',
  title: 'Oops...',
  text: 'Datos  Incorrectos',
  footer: '<a href>Necesitas contactar al administrador?</a>'
})
}

});*/

$(document).ready(function() {
	$("body").on("click", ".eliminarPersona", function() {
		var id_persona = Number($(this).closest("tr").children("td").eq(0).html());
		var persona_activacion = 0;
		$("#procesarEliminarPersona").find("input[name='id_persona']").val(id_persona);
		$("#procesarEliminarPersona").find("input[name='persona_activacion']").val(persona_activacion);
		$("#eliminarPersonaModal").find("form").attr("action", base_url + getContextPath() + '/EliminarPersona');

	});


});



$(document).on("click", ".getDatosPersonales", function() {  // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
	var nombre = $(this).closest("tr").children("td").eq(2).html();
	var apellido = $(this).closest("tr").children("td").eq(3).html();
	var email = $(this).closest("tr").children("td").eq(4).html();
	var telefono = $(this).closest("tr").children("td").eq(5).html();
	var direccion = $(this).closest("tr").children("td").eq(6).html();
	var sistema_prevision = $(this).closest("tr").children("td").eq(7).html();
	$("#agregarPersona").find("input[name='nombre']").val(nombre);
	$("#agregarPersona").find("input[name='apellido']").val(apellido);
	$("#agregarPersona").find("input[name='email']").val(email);
	$("#agregarPersona").find("input[name='telefono']").val(telefono);
	$("#agregarPersona").find("input[name='direccion']").val(direccion);
	$("#agregarPersona").find("input[name='sistema_prevision']").val(sistema_prevision);
});

$(document).on("click", ".editarDatosPersonales", function() {  // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
	var usuario_nombre = $(this).closest("tr").children("td").eq(8).html();
	var nombre = $(this).closest("tr").children("td").eq(2).html();
	var apellido = $(this).closest("tr").children("td").eq(3).html();
	var email = $(this).closest("tr").children("td").eq(4).html();
	var telefono = $(this).closest("tr").children("td").eq(5).html();
	var direccion = $(this).closest("tr").children("td").eq(6).html();
	var sistema_prevision = $(this).closest("tr").children("td").eq(7).html();
	$("#editarPersona").find("input[name='usuario_nombre']").val(usuario_nombre);
	$("#editarPersona").find("input[name='nombre']").val(nombre);
	$("#editarPersona").find("input[name='apellido']").val(apellido);
	$("#editarPersona").find("input[name='email']").val(email);
	$("#editarPersona").find("input[name='telefono']").val(telefono);
	$("#editarPersona").find("input[name='direccion']").val(direccion);
	$("#editarPersona").find("input[name='sistema_prevision']").val(sistema_prevision);
});

//MODAL Editar Usuario FUll
$("#agregarPersona").on("submit", function(event) {
	event.preventDefault();
	var formdata = $(this).serialize();

	console.log(formdata)

	$.ajax({
		url: base_url + getContextPath() + '/nuevapersona',
		method: 'POST',
		data: formdata,
		success: function(data) {
			// alert sweetalert2
			$("#agregarPersonaModal").modal("hide");
			location.reload();
		}
	});
});



//MODAL Nuevo Persona

$("#agregarPersona").on("submit", function(event) {
	event.preventDefault();
	var formdata = $(this).serialize();

	console.log(formdata)

	$.ajax({
		url: base_url + getContextPath() + '/nuevapersona',
		method: 'POST',
		data: formdata,
		success: function(data) {
			// alert sweetalert2
			$("#agregarPersonaModal").modal("hide");
			location.reload();
		}
	});
});


var base_url = window.location.origin;
// "http://stackoverflow.com"

var host = window.location.host;
// stackoverflow.com



function getContextPath() {
	return window.location.pathname.substring(0, window.location.pathname.indexOf("/", 2));
}
